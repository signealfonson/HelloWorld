package Excersices.Chapter6.Exc5;

public class Motorboat extends Boat{


    public Motorboat(String model, int weight, int price) {
        super(model, weight, price);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med motorbåt till " + destination);
    }
}
