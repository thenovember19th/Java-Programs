package day4assignment;

import java.util.Scanner;

public class FoodPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter food item name");
        String food = sc.nextLine().toLowerCase();

        switch (food){
            case "pizza":
                System.out.println("Pizza price is Rs.499");
                break;
            case "burger":
                System.out.println("Burger price is Rs.299");
                break;
            case "pasta":
                System.out.println("Pasta price is Rs.399");
                break;
            default:
                System.out.println("Sorry!! This food item is not in our menu.");
        }
        sc.close();
    }
}
