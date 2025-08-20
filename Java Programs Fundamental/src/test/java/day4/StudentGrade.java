package day4;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks");
        double marks = sc.nextDouble();

        if(marks>=90 && marks<=100){
            System.out.println("Congratulations!! You got grade A");
        }
        else if(marks>=75 && marks<=89){
            System.out.println("You got grade B");
        }
        else if(marks>=60 && marks<=74){
            System.out.println("You got grade C");
        }
        else if(marks>=50 && marks<=59){
            System.out.println("You got grade D");
        }
        else if(marks>=0 && marks<=49) {
            System.out.println("Sorry!! You are failed");
        }
        else {
            System.out.println("Please enter valid marks");
        }
    }
}
