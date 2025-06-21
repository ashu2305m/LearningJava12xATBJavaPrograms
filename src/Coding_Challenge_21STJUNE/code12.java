package Coding_Challenge_21STJUNE;

import java.util.Scanner;

/*Create a program to calculate factorial of a number using while loop.
  Handle edge case for 0! = 1*/
public class code12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int fact = 1;

        if (num == 0) {
            fact = 1;
        } else {

            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}
