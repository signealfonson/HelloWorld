package Excersices.Chapter6.Uppgift;

public class Landbased extends Vehicle{
    int kmCounter;

    public Landbased(int weight, int price, int kmCounter) {
        super(weight, price);
        this.kmCounter = kmCounter;
    }
    public void drive(int kmCounter){
        this.kmCounter = this.kmCounter + kmCounter;
    }
}
