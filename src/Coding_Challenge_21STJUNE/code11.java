package Coding_Challenge_21STJUNE;

/*Write a program to print numbers from 1 to N using a for loop.

**Requirements:**
        - Read the value of N from user input
- Use for loop to print numbers from 1 to N
- Print numbers in a single line separated by spaces*/

import java.util.Scanner;

public class code11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();

        for(int i=1; i<=number; i++){
            System.out.println(i);
        }

    }
}
