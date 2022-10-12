package Laboration2;

import java.util.ArrayList;

public class Category {
    private final String name;
    public final ArrayList<ProductInfo> productsInCategory = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public ArrayList<ProductInfo> getProductsInCategory() {
        return productsInCategory;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

}
