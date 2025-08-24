package day7;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");
        int number = sc.nextInt();
        int test = 4;
        int i;
        double average=0;
        for(i=1;i<=number;i++) {
            System.out.println("Enter the score of a student "+i);
            double score = sc.nextDouble();
            average = score/test;
        }
        System.out.println("Average score is:" +average);

    }
}
