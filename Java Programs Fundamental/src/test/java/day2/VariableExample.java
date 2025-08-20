package day2;
import java.util.Scanner;

public class VariableExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter you Name");
        String name = sc.nextLine();
        System.out.println("Please enter your Number");
        int number = sc.nextInt();

        System.out.println("Your name is " + name + " and you number is " + number);
    }
}
