package Coding_Challenge_21STJUNE;

import java.util.Scanner;

/*Write a program to find and print all prime numbers between 1 and 100 using loops.*/
public class code15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // if user enters 1 0r less than 1 ,
        // it will not enter into loop for this below condition is required
        if (num <= 1)
        {
            System.out.println("Not prime");
            return;
        }
        if (num == 2) {
            System.out.println("Prime");
            return ;
        }

        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                System.out.println("Not prime");
                return ;
            }
        }

        System.out.println("Prime");
    }
    }

