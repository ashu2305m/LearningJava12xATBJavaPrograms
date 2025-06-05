package Tasks;

import java.util.Scanner;

public class Task10_PalindromeOfStringUpdated {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        String str = scanner.next();
        String  originalnum = str;
        String  reversenum = "";

        if(str.length()>=2)
        {
            for(int i = str.length() -1; i>=0;i--)
            {
                reversenum = reversenum + originalnum.charAt(i);
            }
        }
        else
        {
            System.out.println("Invalid input. Please enter a number with at least two digits.");
        }

        if (originalnum.equals(reversenum))
        {
            System.out.println(originalnum + " is a palindrome number.");
        }
        else
        {
            System.out.println(originalnum + " is not a palindrome number.");
        }
    }
}
