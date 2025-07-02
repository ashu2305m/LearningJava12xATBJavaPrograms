package Tasks;

import java.util.Scanner;

public class Task9_Vowels_Consonant_Count {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Alphabets A-Z or a-z");
        String str = scanner.next().toLowerCase();
        int VowelsCount = 0;// we need to declare initial value because its local variable
        int ConsonantsCount = 0;
        //check if users enter alphabet or not

        for (int i = 0; i <= str.length() - 1; i++)
        {
            char ch = str.charAt(i);
            // Character.isLetter(ch) is a static method from the Character wrapper class.
            // It returns true if the character ch is an alphabet letter (A-Z or a-z), and false otherwise
            if (Character.isLetter(ch)) // This ensures that only actual letters are counted as vowels or consonants
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    VowelsCount++;
                } else {
                    ConsonantsCount++;
                }

            }
            else
            {
                System.out.println("invalid input please enter alphabet");
            }
        }
        System.out.println("total number of vowels ->" + VowelsCount);
        System.out.println("total number of consonants -> " + ConsonantsCount);
    }
}
