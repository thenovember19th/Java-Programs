package day8;

import java.util.Scanner;

public class CreditCheck {
    public static void creditCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();
        System.out.println("Enter your credit score");
        double credit = sc.nextDouble();

        if(salary>40000 && credit>=700){
            System.out.println("Congratulations!! You are eligible and can process for loan");
        }
        else {
            System.out.println("Sorry!! You are not eligible for loan");
        }
    }

    public static void main(String[] args) {
        creditCheck();
    }
}
