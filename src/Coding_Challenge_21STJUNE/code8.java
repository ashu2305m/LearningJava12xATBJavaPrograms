package Coding_Challenge_21STJUNE;

import java.util.Scanner;

/*Write a program to check if a given year is a leap year.

**Requirements:**
        - A year is leap if it's divisible by 4
        - Exception: if divisible by 100, it's not leap unless also divisible by 400
        - Use logical operators in conditions*/
public class code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("It is a leap year");
        }else {
            System.out.println("Not a leap year");
        }
    }
}
