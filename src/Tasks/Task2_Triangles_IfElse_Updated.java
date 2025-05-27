package Tasks;

import java.util.Scanner;

public class Task2_Triangles_IfElse_Updated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side length n1: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter side length n2: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter side length n3: ");
        int n3 = scanner.nextInt();

        // Add a check for valid side lengths (must be positive)
        if (n1 <= 0 || n2 <= 0 || n3 <= 0) {
            System.out.println("Side lengths must be positive numbers.");
        }
        // Condition where a triangle cannot be formed (Triangle Inequality Theorem)
        // sum of two sides should be greater than third side
        else if (n1 + n2 <= n3 || n1 + n3 <= n2 || n2 + n3 <= n1) {
            System.out.println("The given side lengths cannot form a triangle.");
        }
        // Original conditions for classifying the type of triangle
        else if (n1 == n2 && n2 == n3) {
            System.out.println("This is an Equilateral Triangle");
        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("This is an Isosceles Triangle");
        } else {
            System.out.println("This is a Scalene Triangle");
        }

        scanner.close(); // It's good practice to close the scanner when done
    }
}
