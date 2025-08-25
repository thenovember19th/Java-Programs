package day8;

import java.util.Scanner;

public class CalculateSum {
    public static double calculateSum(double firstNum, double secondNum){
        return firstNum+secondNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();

        double result = calculateSum(a,b);

        System.out.println("sum is:"+result);
    }
}
