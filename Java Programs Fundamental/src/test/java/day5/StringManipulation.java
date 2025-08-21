package day5;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out.println("Your name in lowercase is: " +name.toLowerCase());
        System.out.println("Your name in uppercase is: " +name.toUpperCase());
        System.out.println("The length of your name is: " +name.length());

        sc.close();
    }
}
