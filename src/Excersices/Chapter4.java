package Excersices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Chapter4 {

    public static void main(String[] args) {
        task3();
    }
    public static void task1() {
        String[] colours = {"yellow", "green", "orange", "blue", "grey"};
        for (String i : colours) {
            System.out.println(i);
        }
    }
    public static void task2() {
        int[] numbers = {2, 3, 5, 8, 13, 21, 34};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0)
                sum += numbers[i];
            else
                sum -= numbers [i];
        }
        System.out.println(sum);
    }
    public static void task3() {
        Random rd = new Random();
        int[] array = new int[5];
        int i = 0;
        for (i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
        } // för att slumpa fram 5 heltal
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int largest = 0;
        int smallest = 100;
        int udda = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
                //för att alltid göra om ett större nummer till array[i]
            }   if (array[i] < smallest) {
                smallest = array[i];
                //för att alltid göra om ett lägre nummer till array[i]
            }   if (array[i] % 2 == 1) {
                udda++; //för att plussa på 1 varje gång man får ett udda tal
            }   if (array[i] % 2 == 1) {
                udda++; //för att plussa på 1 varje gång man får ett udda tal
            }
        }
        System.out.println("Största: " + largest + " minsta är: " + smallest);
        System.out.println("Udda: " + udda);
    }
    public static void task4() {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("How long do you want the array to be?");
        int[] array = new int[s.nextInt()];
        int i = 0;
        double sum = 0;
        for (i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        } // för att slumpa fram heltal
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("The mean value of the numbers is: " + sum / array.length);
    }

    public static void task7() {
//        Uppgift A;
//        for (int y = 0; y < 4; y++) {
//            for (int x = 0; x < 8; x++) {
//                if (x == y)
//                    System.out.print("#");
//                else
//                    System.out.print("-");
//            }
//            System.out.println("");
//        }
//        Uppgift B;
//        for (int y = 0; y < 4; y++) {
//            for (int x = 0; x < 8; x++) {
//                    if (x == y)
//                        System.out.print("#");
//                    else if (x == (y + 4))
//                        System.out.print("#");
//                    else
//                        System.out.print("-");
//                }
//                System.out.println("");
//       }
//        Uppgift C;
//        for (int y = 0; y < 8; y =(y + 2)) {
//            for (int x = 0; x < 8; x++) {
//                if (x == y || x == (y + 1))
//                    System.out.print("#");
//                else
//                    System.out.print("-");
//            }
//            System.out.println("");
//        }
//      Uppgift D;
//        for (int row = 0; row < 4; row++) {
//            for (int col = 0; col < 8; col++) {
//                if (col == 2 || col == 5 || row == 2)
//                    System.out.print("#");
//                else
//                    System.out.print("-");
//            }
//            System.out.println("");
//        }
//
//        Uppgift D;
//        for (int row = 0; row < 4; row++) {
//            for (int col = 0; col < 8; col++) {
//                if (col == 2 || col == 5 || row == 2)
//                    System.out.print("#");
//                else
//                    System.out.print("-");
//            }
//            System.out.println("");
//        }
//        Uppgift E
//        int x = 5;
//        for (int row = 0; row < 4; row++) {
//            x--;
//            for (int col = 0; col < 8; col++) {
//                if (row == col || col == x)
//                    System.out.print("#");
//                else
//                    System.out.print("-");
//            }
//            System.out.println("");
//        }
//        Uppgift F
//        for (int row = 0; row < 6; row++) {
//            for (int col = 0; col < 6; col++) {
//                if ((col + row) % 2 == 0)
//                    System.out.print("#");
//                else
//                    System.out.print("-");
//            }
//            System.out.println("");
//        }
//        Uppgift G
//        for (int row = 0; row < 4; row++) {
//            for (int col = 0; col < 6; col++) {
//                if (col < 3 && row <3)
//                    System.out.print("#");
//                else
//                    System.out.print("-");
//            }
//            System.out.println("");
//        }
//    }

//
    }
}