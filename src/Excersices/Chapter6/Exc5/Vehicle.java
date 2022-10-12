package Excersices.Chapter6.Exc5;

abstract class Vehicle {
    private final String model;
    private final int weight;

    private final int price;

    public Vehicle(String model, int weight, int price) {
        this.model = model;
        this.weight = weight;
        this.price = price;
    }
    abstract void goTo(String destination);
}
//
//    public void goTo (String destination){
//        System.out.println("Färdas till " + destination);
//    }
//
//    public static void main(String[] args) {
//
//        Bicycle firstBicycle = new Bicycle("Cresent", 15);
//        Boat firstBoat = new Boat("Eka", 300);
//        Car firstCar = new Car("Audi", 500);
//        Motorboat firstMotorboat = new Motorboat("Yamarin", 1500);
//        Sail firstSail = new Sail("Maxi", 1200);
//
//        firstBicycle.goTo("Bahamas");
//        firstMotorboat.goTo("Alaska");
//    }
//}
