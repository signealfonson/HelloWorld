package Excersices.Chapter6.Exc5;

public class Bicycle extends Vehicle{


    public Bicycle(String model, int weight, int price) {
        super(model, weight, price);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med cykel till " + destination);
    }
}
