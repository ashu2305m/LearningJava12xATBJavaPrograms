package Tasks;

import java.util.Scanner;

public class Task19_FirstLetterOfEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); // Read the full line including spaces


        // Step 1: Trim leading/trailing spaces (optional)
        str = str.trim();

        // Step 2: Split the string by spaces
        String[] words = str.split("\\s+"); // handles multiple spaces

        // Step 3: Loop through each word and print the first character
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0) + " ");
            }
        }
    }
}
/*
     complete explanation of a program
     First, the program takes input from the user using the Scanner class.
      Then it trims the leading and trailing spaces.
      After that, it splits the input string into individual words using .split("\\s+") which handles multiple spaces.
       Then, using an enhanced for loop, it iterates over each word.
        Inside the loop, it checks whether the word is not empty, and
        if so, prints only the first character (i.e., charAt(0)) of that word.
        This way, it prints the first letter of each word in the input string.
 */
