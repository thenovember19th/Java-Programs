package day6;

import java.util.Scanner;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean choice;
        do {
            System.out.println("Please enter first number");
            double firstNum = sc.nextDouble();
            System.out.println("Please enter second number");
            double secondNum = sc.nextDouble();

            double sum = firstNum + secondNum;
            System.out.println("The sum is " + sum);

            System.out.println("Do you want to add another number?True/False?");
            choice = sc.nextBoolean();
        } while (choice);
        System.out.println("Program ended");
        sc.close();
    }
}
