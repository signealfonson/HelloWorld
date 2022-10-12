package Excersices;

import java.util.Scanner;

public class Chapter1 {
    public static void main(String[] args) {
        task7();
    }

        public static void task2_3() {
            Scanner s = new Scanner(System.in);
            System.out.println("Name:");
            String name = s.nextLine();
            System.out.println("Hi " + name + "! Enter your age:");
            int age = s.nextInt();
            System.out.println(age);
        }
        public static void task4() {
            Scanner s = new Scanner(System.in);
            System.out.println("Number 1:");
            int x = s.nextInt();
            System.out.println("Number 2:");
            int y = s.nextInt();
            int sum = x + y, sum2 = x * y;
            System.out.println("Sum = " + sum + ", product = " + sum2);
        }
        public static void task5() {
            System.out.println("Decimal number:");
            Scanner s = new Scanner(System.in);
            double d = Double.parseDouble(s.next());
            int number= (int) d;
            System.out.println(number);
        }
        public static void task6() {
            System.out.println("Number 1:");
            Scanner s = new Scanner(System.in);
            int x = s.nextInt();
            System.out.println("Number 2:");
            int y = s.nextInt();
            int sum = (x + y) / 2;
            System.out.println("The mean value of the numbers is:" + sum);
        }
        public static void task7() {
            System.out.println("What is the balance of your bank account");
            Scanner s = new Scanner(System.in);
            double balance = s.nextDouble();
            System.out.println("Interest:");
            double interest = s.nextDouble();
            double sum = balance * interest;
            System.out.println(sum);
    }

    }



