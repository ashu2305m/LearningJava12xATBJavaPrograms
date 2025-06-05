package Tasks;

import java.util.Scanner;

public class Task12_ArmstrongNumberUpdated {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you like!!");
        int number= scanner.nextInt();

        int originalNumber = number;
        int digits = String.valueOf(number).length();
        int sum = 0;
        if(number<10)
        {
            System.out.println("Invalid input!, please enter minimum two digit number ");
        }

        while (number != 0)
        {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == originalNumber)
        {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

    }
}