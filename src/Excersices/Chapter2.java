package Excersices;

import java.util.Random;
import java.util.Scanner;

public class Chapter2 {

    public static void main(String[] args) {
        task8();
    }
    public static void task4() {
        System.out.println("Enter an interger:");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i < 100) {
            System.out.println("The number is lower than 100");
        } else if (i > 100) {
            System.out.println("The number is larger than 100");
        } else {
            System.out.println("The number is 100");
        }
    }
    public static void task5() {
        System.out.println("Enter a month:");
        Scanner s = new Scanner(System.in);
        String month = s.nextLine();
        switch (month) {
            case "January" -> System.out.println(1);
            case "February" -> System.out.println(2);
            case "Mars" -> System.out.println(3);
        }
    }
    public static void task6() {

        Scanner s = new Scanner(System.in);
        System.out.println("Guess a number between 1-100");
        int guess = s.nextInt();
        int guesses = 1;
        Random rand = new Random();
        int number = rand.nextInt(1, 101);
        while (number != guess) {
            if (guess < number) {
                System.out.println("Try a higher number");
            } else if (number < guess) {
                System.out.println("Try a lower number");
            }
            guess = s.nextInt();
            guesses ++;
        }
        System.out.println("Nice work, you made it in " + guesses + " guesses!");
    }
    public static void task7() {
        for (int i = 1; i <= 16; i++) {
            System.out.println(i);
        }
    }
    public static void task8() {
        for (int i = 20; i >= 2; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void task9() {
        for (int i = 65536; i > 2; i /=2);

    }
}