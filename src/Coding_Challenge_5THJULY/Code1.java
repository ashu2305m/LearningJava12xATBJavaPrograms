package Coding_Challenge_5THJULY;

import java.util.Scanner;

// Write a custom exception called `InvalidAgeException` and throw it if age is less than 18.
public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if(age > 18) {
                System.out.println("Valid Age");
            }} catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
