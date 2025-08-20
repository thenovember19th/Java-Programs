package day3;

import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        double pay = 1000;
        double bonus = 250;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of sales you have done");
        int sales = sc.nextInt();

        if (sales>10){
            double total = pay+bonus;
            System.out.println("Your total bonus is $ "+total);
        }
        else {
            System.out.println("Your total bonus is $ "+pay);
        }
    }
}
