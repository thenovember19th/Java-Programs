package day4;

import java.util.Scanner;

public class GradeRemark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your grade");
        String grade = sc.nextLine().toUpperCase();

        switch (grade){
            case "A":
                System.out.println("Congratulations!! You got excellent grade");
                break;
            case "B":
                System.out.println("Very Good!! You got good grades");
                break;
            case "C":
                System.out.println("Satisfactory!! You got average grade");
                break;
            case "D":
                System.out.println("You need to be serious in your studies");
                break;
            case "F":
                System.out.println("Sorry!! Better luck next time!");
                break;
            default:
                System.out.println("Please enter valid grade");
        }
        sc.close();
    }
}
