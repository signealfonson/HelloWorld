package Excersices;

import java.time.Month;

public class Chapter5 {
    public static void main(String[] args) {
        int number = 8;
        System.out.println(f4(String.valueOf(number)));
    }

    static void f3(String name, String city, byte number) {
        System.out.println("Välkommen " + name + "från " + city + number);
    }

    public static int f4(String number) {
        number = "8";
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Wrong");
            return Integer.parseInt(number);
        }

    }

    public static int f6(Month month) {
        return month.numberOfDays;
    }

    public enum Month {
        Jan(31),
        Feb(28),
        Mars(31),
        April(30);

        final int numberOfDays;

        Month(int numberOfDays) {
            this.numberOfDays = numberOfDays;
        }
    }

//    public static String f7(startindex, [length]) {
//
//
//
//
//    return null;
//    }
}