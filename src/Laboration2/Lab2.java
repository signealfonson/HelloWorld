package Laboration2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Consumer;

public class Lab2 {
    private static final Scanner s = new Scanner(System.in);
    public static ArrayList<Category> listOfCategories = new ArrayList<>();

    public static void main(String[] args) {

        listOfCategories = readFromFile();
        if(listOfCategories.isEmpty()){
        mainCategories();}
        mainMenu();
    }
    private static ArrayList<Category> readFromFile() {
        Gson gson = new Gson();
        String homeFolder = System.getProperty("user.home");

        try {
            String jsonText =  Files.readString(Path.of(homeFolder, "json","Signe's Bakery.json"));
            return gson.fromJson(jsonText, new TypeToken<ArrayList<Category>>() { }.getType());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void mainMenu() {
        while (true) {
            switch (showMainMenuAndGetUserInput()) {
                case "1" -> chooseCategory();
                case "2" -> searchProduct();
                case "3" -> saveToFile();
                case "E","e" -> System.exit(0);
                default -> incorrectInput();
            }
        }
    }

    private static String showMainMenuAndGetUserInput() {
        System.out.println("Signe's Bakery");
        System.out.println("--------------");
        System.out.println("1. Handle products");
        System.out.println("2. Search product");
        System.out.println("3. Save to file");

        return s.next();
    }
    private static void incorrectInput(){
        System.out.println("Incorrect input, please try again!");
    }

    private static int showCategories() {
        while (true) {
            System.out.println("Choose a category: ");
            System.out.println("1. Add a new category");
            System.out.println("2. Return to previous menu");
            for (int i = 0; i < listOfCategories.size(); i++) {
                System.out.println((i + 3) + ". " + listOfCategories.get(i).toString());
            }
            try {
                return Integer.parseInt(s.next());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect option, please try again!");
            }
        }
    }

    private static void mainCategories() {
        listOfCategories.add(new Category("Bread"));
        listOfCategories.add(new Category("Pies"));
        listOfCategories.add(new Category("Cookies"));
    }

    private static void chooseCategory() {
        int choice = showCategories();
        if (choice == 1) {
            System.out.println("Name new category: ");
            listOfCategories.add(new Category(s.next()));
        } else if (choice == 2) {
            mainMenu();
        } else if (choice - 3 >= 0 && choice - 3 < listOfCategories.size()) {
            Category chosenCategory = listOfCategories.get(choice - 3);
            System.out.println(chosenCategory + " menu");
            configureProduct(chosenCategory);
        } else {
            incorrectInput();
        }
    }

    private static String showProductChoices() {
        System.out.println("What would you like to do:");
        System.out.println("1. Add a product");
        System.out.println("2. Remove a product");
        System.out.println("3. See inventory balance");
        System.out.println("4. Return to previous menu");

        return s.next();
    }

    private static void configureProduct(Category categoryObject) {
        while (true) {
            switch (showProductChoices()) {
                case "1" -> addProduct(categoryObject);
                case "2" -> removeProduct(categoryObject);
                case "3" -> inventoryBalance(categoryObject.productsInCategory);
                case "4" -> {
                    return;
                }
                default -> incorrectInput();
            }
        }
    }

    private static void inventoryBalance(ArrayList<ProductInfo> productsInCategory) {
        productsInCategory.forEach(printInventoryBalance());
    }

    private static Consumer<ProductInfo> printInventoryBalance() {
        return productInfo -> System.out.println("Inventory balance: \nProduct: " + productInfo.getName() +
                "\nStock: " + productInfo.getInventoryBalance());
    }

    private static void removeProduct(Category categoryObject) {
        while (true) {
            if (categoryObject.getProductsInCategory().isEmpty()) {
                System.out.println("There is no product to remove.");
                return;
            }
            System.out.println("Which product would you like to remove?");
            int choice = showProducts(categoryObject);
            try {
                ProductInfo productToModify = categoryObject.getProductsInCategory().get(choice - 1);
                int currentProductBalance = productToModify.getInventoryBalance();
                if (currentProductBalance > 0) {
                    productToModify.setInventoryBalance(currentProductBalance - 1);
                    System.out.println("Product successfully removed.");
                } else {
                    System.out.println("There is no product to remove");
                }
                return;
            } catch (IndexOutOfBoundsException e) {
                incorrectInput();
            }
        }
    }

    private static int showProducts(Category categoryObject) {
        for (int i = 0; i < categoryObject.getProductsInCategory().size(); i++) {
            System.out.println((i + 1) + ". " + categoryObject.getProductsInCategory().get(i).getName());
        }
        return askForAndVerifyIntInput();
    }

    private static void addProduct(Category categoryObject) {
        System.out.println("Please add the new product's EAN-number: ");
        int ean = askForAndVerifyIntInput();
        Optional<ProductInfo> existingProduct = categoryObject.getProductsInCategory().stream()
                .filter(productInfo -> productInfo.getEan() == ean)
                .findAny();
        if (existingProduct.isPresent()) {
            int currentProductBalance = existingProduct.get().getInventoryBalance();
            existingProduct.get().setInventoryBalance(currentProductBalance + 1);
            System.out.println("Product successfully added.");
            return;
        }
        System.out.println("Please add the new product's name: ");
        String name = s.next();
        System.out.println("Please add the new product's price: ");
        int price = askForAndVerifyIntInput();
        ProductInfo product = new ProductInfo(name, price, ean);
        categoryObject.getProductsInCategory().add(product);
        System.out.println("Product successfully added.");

    }

    private static int askForAndVerifyIntInput() {
        while (true) {
            try {
                return Integer.parseInt(s.next());
            } catch (NumberFormatException e) {
                incorrectInput();
            }
        }
    }

    private static String searchInfo() {
        System.out.println("1. Search by product name");
        System.out.println("2. Search by price cheaper than:");
        System.out.println("3. Search by price more expensive than:");
        System.out.println("4. Return to previous menu");

        return s.next();
    }

    private static void searchProduct() {
        while (true) {
            System.out.println("What would you like to search by?");
            switch (searchInfo()) {
                case "1" -> searchByName();
                case "2" -> searchByCheaperPrice();
                case "3" -> searchByPriceMoreExpensive();
                case "4" -> {
                    return;
                }
                default -> incorrectInput();
            }
        }
    }

    private static void searchByName() {
        System.out.println("Which product would you like to see?");
        String input = s.next();
         var listResult = listOfCategories.stream().flatMap(category -> category.getProductsInCategory().stream())
            .filter(product -> product.getName().equalsIgnoreCase(input))
                .findFirst();
         if(listResult.isEmpty()) {
             System.out.println("There is no such product in stock");
         } else {
             System.out.println(listResult.get());
         }
    }

    private static void searchByCheaperPrice() {
        System.out.println("Please enter a price:");
        int input = s.nextInt();
        System.out.println("Following products are cheaper than " + input + ":");
        listOfCategories.stream().flatMap(category -> category.getProductsInCategory().stream())
                .filter(product -> product.getPrice() < input)
                .forEach(System.out::println);
    }

    private static void searchByPriceMoreExpensive() {
        System.out.println("Please enter a price:");
        int input = s.nextInt();
        System.out.println("Following products are more expensive than " + input + ":");
        listOfCategories.stream().flatMap(category -> category.getProductsInCategory().stream())
                .filter(product -> product.getPrice() > input)
                .forEach(System.out::println);
    }

    private static void saveToFile() {
        Gson gson = new Gson();
        String json = gson.toJson(listOfCategories);
        String homeFolder = System.getProperty("user.home");

        try {
            Files.createDirectory(Path.of(homeFolder, "json"));
            Files.writeString(Path.of(homeFolder, "json","Signe's Bakery.json"), json);
            System.out.println("File saved.");
        } catch (IOException e) {
            System.out.println("Unable to save file, please try again.");
        }
    }
}