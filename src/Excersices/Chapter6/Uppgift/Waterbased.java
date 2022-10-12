package Excersices.Chapter6.Uppgift;

import java.util.Random;

public class Waterbased extends Vehicle{
    private final Random firstRandom = new Random();
    private double longitud;
    private double latitud;

    public Waterbased(int weight, int price) {
        super(weight, price);
    }

    public void go() {
        longitud = firstRandom.nextDouble();
        latitud = firstRandom.nextDouble();
        System.out.println("Position:" + latitud + " " + longitud);
    }
    public double getLongitud() {
        return longitud;
    }

    public double getLatitud() {
        return latitud;
    }
}
