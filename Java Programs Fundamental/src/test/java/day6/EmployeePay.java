package day6;

import java.util.Scanner;

public class EmployeePay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of hours worked by employee");
        double hours = sc.nextDouble();

        while(hours>40){
            System.out.println("You should not exceed company limit of working 40 hours per week. Please re-enter within range");
            hours = sc.nextDouble();
        }
        double totalPay = hours * 15;
        System.out.println("Your total amount is: $"+totalPay);

    }
}
