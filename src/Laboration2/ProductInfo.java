package Laboration2;

import java.util.Objects;

public class ProductInfo {
    private String name;
    private int price;
    private int ean;
    private int inventoryBalance;

    public ProductInfo(String name, int price, int ean) {
        this.name = name;
        this.price = price;
        this.ean = ean;
        this.inventoryBalance = 1;
    }
    public int getInventoryBalance() {return inventoryBalance;}

    public void setInventoryBalance(int inventoryBalance) {
        this.inventoryBalance = inventoryBalance;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }



    public int getEan() {
        return ean;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public void setIdCode(int ean) {
        this.ean = ean;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInfo that = (ProductInfo) o;
        return price == that.price && ean == that.ean && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, ean);
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ean=" + ean +
                ", inventoryBalance=" + inventoryBalance +
                '}';
    }
}
