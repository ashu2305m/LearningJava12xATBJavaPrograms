package Tasks;

public class Task16_Reverse_Recursive {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverse(input);  // calling the function
        System.out.println(reversed);      // output: olleH
    }

    public static String reverse(String str)
    {
        if (str.isEmpty())
        {
            return str; // base case: when string is empty
        }
        // take the first character to the end, and reverse the rest
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
/*
Call stack (function calls)	What is returned:
---------------------------------------------
reverse("Hello")	reverse("ello") + 'H'
reverse("ello")	reverse("llo") + 'e'
reverse("llo")	reverse("lo") + 'l'
reverse("lo")	reverse("o") + 'l'
reverse("o")	reverse("") + 'o'
reverse("")	"" (base case)


What is str.substring(1) and str.charAt(0)?

str.substring(1) means take the string without the first character.
For "Hello", str.substring(1) is "ello".

str.charAt(0) is the first character of the string, which is 'H'.
*/
