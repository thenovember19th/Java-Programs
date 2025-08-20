package day4;

import java.util.Scanner;

public class LoanEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your monthly income");
        double salary = sc.nextDouble();

        System.out.println("Enter your number of years you Worked here");
        double years =sc.nextDouble();

        if(salary>=30000 && years>=2){
            System.out.println("You qualified for loan");
        }
        else {
            System.out.println("Sorry!! You do not qualify for loan");
        }
    }
}
