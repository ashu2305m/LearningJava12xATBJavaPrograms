package Coding_Challenge_21STJUNE;

import java.util.Scanner;

/***Requirements:**
        - Read an integer from user input
- Use if-else statements to classify the number
- Print appropriate message for each case*/
public class code6 {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }


    }
}
