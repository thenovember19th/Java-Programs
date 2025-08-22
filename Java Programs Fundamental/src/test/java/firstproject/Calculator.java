package firstproject;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Please enter first number: ");
            double firstNumber = sc.nextDouble();
            System.out.println("please enter second number: ");
            double secondNumber = sc.nextDouble();

            System.out.println("Please enter your choice of arithmetic operation: \n" +
                    "1. Sum \n" +
                    "2. Difference \n" +
                    "3. Product \n" +
                    "4. Division \n" +
                    "0. Exit \n");
            sc.nextLine();

            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    double sum = firstNumber+secondNumber;
                    System.out.println("The sum is: " + sum);
                    break;
                case "2":
                    double difference = firstNumber-secondNumber;
                    System.out.println("The difference is: " + difference);
                    break;
                case "3":
                    double product = firstNumber*secondNumber;
                    System.out.println("The product is: " + product);
                    break;
                case "4":
                    double division = firstNumber/secondNumber;
                    System.out.println("The division is: " + division);
                    break;
                case "0":
                    System.out.println("Exiting program....");
                    break;
                default:
                    System.out.println("Please enter valid option from (0-4)");
            }
        }while (!choice.equals("0"));

        sc.close();
    }
}
