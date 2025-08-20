package day3assignment;

import java.util.Scanner;

public class CongratulatoryMsg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of sales you have done!!");
        int sales = sc.nextInt();

        if(sales>=10){
            System.out.println("Congratulations!! Your sales number exceed 10 so you will receive bonus amount $250");
        }
        else {
            int shorted_sales = 10 - sales;
            System.out.println("Your sales are shorted by "+shorted_sales);
        }
    }
}
