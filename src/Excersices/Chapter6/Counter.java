package Excersices.Chapter6;

public class Counter {
    private int number;
    private static int nInstances;

    public Counter(){
        number = 0;
        nInstances++;
    }
    public void increase(){
        number++;
    }
    public void decrease(){
        number--;
    }
    public int value(){
        return number;
    }
    public void print(){

    }

    public static void main(String[] args) {
        Counter count = new Counter();
        count.increase();
        System.out.println(count.value());
        count.decrease();
        System.out.println(count.value());
    }
}
