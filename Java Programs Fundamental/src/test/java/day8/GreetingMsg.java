package day8;

import java.util.Scanner;

public class GreetingMsg {
    public static void greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Good morning!!"+name);
    }

    public static void main(String[] args) {
        greeting();
    }

}
