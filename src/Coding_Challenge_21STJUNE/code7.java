package Coding_Challenge_21STJUNE;

import java.util.Scanner;

/*Create a program to find the largest among three numbers using if-else statements.

**Requirements:**
        - Read three integers from user input
- Use nested if-else or if-else if statements*/
public class code7 {
    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3: ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("num1 is greatest");
        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is greatest");
        } else {
            System.out.println("num3 is greatest");
        }
    }
}
