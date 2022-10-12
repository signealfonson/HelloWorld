package Excersices.Chapter6.Uppgift;

public class Airborn extends Vehicle {
    private int height = 0;

    public Airborn(int weight, int price) {
        super(weight, price);
    }

    public void fly(boolean isFlying) {
        if (isFlying) {
            height = height + 1000;
        } else {
            height = 0;
        }
    }
}
