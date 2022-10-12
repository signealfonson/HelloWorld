package Excersices;

import java.util.Scanner;

public class Chapter3 {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        System.out.println("Enter a decimal number:");
        Scanner s = new Scanner(System.in);

        while (true) {
            try {
                String dn = s.nextLine();
                System.out.println(Double.parseDouble(dn));
                break;
            } catch (Exception e) {
                System.out.println("Försök igen");
            }

        }
    }
}
