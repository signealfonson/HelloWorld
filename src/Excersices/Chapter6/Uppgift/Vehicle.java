package Excersices.Chapter6.Uppgift;

public class Vehicle {
        private final int weight;

        private final int price;

    public Vehicle(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }


    public static void main(String[] args) {
        Person firstPerson = new Person("Larsa", 48, "Go gubbe", 8000000);
                //Skapa en dealer och en buyer säg till dealern att buyern vill köpa objektet

        Boat firstBoat = new Boat(1500, 20000, firstPerson);
        firstBoat.go();
    }

}
