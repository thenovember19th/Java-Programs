package day3;

import java.util.Scanner;

public class PayRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of hours worked");
        double hours = sc.nextDouble();
        System.out.println("Enter the hourly pay rate");
        double rate = sc.nextDouble();

        double amount = hours*rate;

        System.out.println("Total amount is Rs." +amount);
    }
}
