package Excersices.Chapter6;

import java.awt.*;


public class Car{
    private String model;
    private int price;
    private Color colour;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    Car() {}

    Car(String model, int price, Color colour) {
        this.model = model;
        this.price = price;
        this.colour = colour;
    }
}


















//public class Car {
//    private String model;
//    private int price;
//    private Color colour;
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public Color getColour() {
//        return colour;
//    }
//
//    public void setColour(Color colour) {
//        this.colour = colour;
//    }
//
//    public Car() {
//
//    }
//
//    public Car(String model, int price, Color colour) {
//        this.model = model;
//        this.price = price;
//        this.colour = colour;
//    }
//
//    public void halfPrice() {
//       price = price/2;
//    }
// public static void main(String[] args) {
//        Car car = new Car ("Model 3", 800000, Color.RED);
//        car.halfPrice();
//     System.out.println(car.getPrice());
//    }
//}
