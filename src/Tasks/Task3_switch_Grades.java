package Tasks;

import java.util.Scanner;

public class Task3_switch_Grades {
    public static <Char> void main(String[] args) {
        // Kids -> A -> Excellent, F -> Fail
        // Create a program that will basically be based on
        // the alphabet or based on the grade.
        // You will give the message to the kid if you got
        // excellent, very good, good, needs improvement,
        // fail, or invalid grade.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Grades: ");
        String Grades = scanner.next();

        switch (Grades){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Needs Improvement");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}

