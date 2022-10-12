package Excersices.Chapter6.Exc5;

import Excersices.Chapter6.NoiseMaker;

public class Boat extends Vehicle implements NoiseMaker {


    public Boat(String model, int weight, int price) {
        super(model, weight, price);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med båt till " + destination);

    }

    @Override
    public void makeNoise() {

    }
}
