package Excersices.Chapter6.Exc5;

import Excersices.Chapter6.NoiseMaker;

public class Car extends Vehicle implements NoiseMaker {


    public Car(String model, int weight, int price) {
        super(model, weight, price);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med bil till " + destination);
    }

    @Override
    public void makeNoise() {

    }
}
