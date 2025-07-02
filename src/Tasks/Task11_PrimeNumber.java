package Tasks;

import java.util.Scanner;

public class Task11_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // if user enters 1 0r less than 1 ,
        // it will not enter into loop for this below condition is required
        if (num <= 1) {
            System.out.println("Not prime");
            return;
        }
        if (num == 2) {
            System.out.println("Prime");
            return;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }

        System.out.println("Prime");
    }
}
    //Case: num = 7
    //Check:
    //
    //7 % 2 → not 0
    //
    //7 % 3 → not 0
    //
    //7 % 4 → not 0
    //
    //7 % 5 → not 0
    //
    //7 % 6 → not 0
    //
    //None divide 7 → ✅ it's Prime

    /*
       for loop flow explanation:
       --------------------------
        Imagine a number, say 7.

        We want to know: “Is 7 a prime number?”

        Prime means: it can only be divided evenly by 1 and itself (7).

        Checking division by 1 or 7 is useless because all numbers are divisible by 1 and themselves.

        So instead, we check every number before 7 — that is 2, 3, 4, 5, 6.

        If any of these divides 7 evenly (with no remainder), then 7 is not prime.

        If none divides 7 evenly, then 7 is prime.
     */