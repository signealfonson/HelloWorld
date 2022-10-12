package Excersices.Chapter7;
import java.util.ArrayList;
import java.util.Random;


public class FirstArrayList {

    public static void main(String[] args) {
        ArrayList<Double> firstArrayList = new ArrayList<>();
        Random Random = new Random();
        for (int i = 0; i <= 10; i++) {
            firstArrayList.add(Random.nextDouble(100));
        }

        for (Double i : firstArrayList) {
            System.out.println(i);
        }
    }
}
