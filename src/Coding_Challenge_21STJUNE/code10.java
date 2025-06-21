package Coding_Challenge_21STJUNE;

import java.util.Scanner;

/*Write a program to create a simple calculator using switch statement.

**Requirements:**
        - Read two numbers and an operator (+, -, *, /)
- Use switch statement to perform the operation
- Handle division by zero
- Display the result*/
public class code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
        int minus = num1 - num2;
        System.out.println(minus);
        int multiply = num1 * num2;
        System.out.println(multiply);
        try {
            int divide = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());;
        }
    }
}
