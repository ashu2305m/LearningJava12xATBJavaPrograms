package Tasks;

import java.util.Scanner;

public class Task7_Grade_Calculator_Updated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerical score (0-100): ");
        int score = scanner.nextInt();

        // Input validation: Check if the score is within a valid range
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a score between 0 and 100.");
        } else {
            // Determine the letter grade using if-else if-else statements
            // It's generally best to start with the highest range and work down
            if (score >= 90) {
                System.out.println("The letter grade is: A");
            } else if (score >= 80) { // This implies score is between 80 and 89
                System.out.println("The letter grade is: B");
            } else if (score >= 70) { // This implies score is between 70 and 79
                System.out.println("The letter grade is: C");
            } else if (score >= 60) { // This implies score is between 60 and 69
                System.out.println("The letter grade is: D");
            } else { // This implies score is between 0 and 59
                System.out.println("The letter grade is: F");
            }
        }

        scanner.close(); // Close the scanner to release system resources
    }
}