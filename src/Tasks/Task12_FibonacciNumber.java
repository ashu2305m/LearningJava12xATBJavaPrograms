package Tasks;

import java.util.Scanner;

public class Task12_FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers you want to print:");
        int count = scanner.nextInt();

        System.out.println("Enter the first number!!");
        int first_number = scanner.nextInt();

        System.out.println("Enter the second number!!");
        int second_number = scanner.nextInt();

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(first_number + " ");
            int next = first_number + second_number;
            first_number = second_number;
            second_number = next;
        }
    }

}

/*
     Now, step-by-step to print Fibonacci numbers:
Suppose you want to print first 5 numbers:

We start with:

first_number = 0

second_number = 1

Now, the next number is 0 + 1 = 1

Then, after that:

New first number = old second number

New second number = next number
 */