package Tasks;

/*Write a program that prints numbers from 1 to 100.
However, for multiples of 3, print "Fizz" instead of the number,
and for multiples of 5, print "Buzz."
For numbers that are multiples of both 3 and 5, print "FizzBuzz."*/


import java.util.Scanner;

public class Task6_FIZZBUZZ_Test {
    public static void main(String[] args) {
        // The problem asks to print numbers from 1 to 100, not take a single input.
        // So, we'll remove the Scanner part for the main solution.
        // If you intended to have the user enter a 'limit' number, that's different.

        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // 1. Check for multiples of both 3 and 5 first (most specific condition)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // 2. Check for multiples of 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // 3. Check for multiples of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // 4. If none of the above, print the number itself
            else {
                System.out.println(i);
            }
        }
    }
}