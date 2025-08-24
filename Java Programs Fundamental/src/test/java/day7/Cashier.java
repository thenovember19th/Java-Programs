package day7;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Please enter the number of items");
        int items = sc.nextInt();
        double amount = 0;
        double total=0;

        for(i=1; i<=items ;i++){
            System.out.println("Enter the price of item"+i);
            double price = sc.nextDouble();
            System.out.println("Enter the number of that items");
            int num = sc.nextInt();
            amount = num*price;
            total = total+amount;
        }
        System.out.println("Total amount is: "+total);
    }
}
