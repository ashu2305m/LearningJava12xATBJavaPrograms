package Tasks;

import java.util.Scanner;

public class Task10_PalindromeOfString {
    public static void main(String[] args) {
        System.out.println("Enter the string to check if its palindrome");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.next();
        String revStr="";

        for (int i=str.length()-1;i>=0;i--)
        {
            char ch= str.charAt(i);
            revStr= revStr+String.valueOf(ch);
        }
        if(str.equals(revStr))
            System.out.println("String is palindrome");
        else System.out.println("String in not a palindrome");
    }
}

/*
Example Trace for str = "abc":
Initial: str = "abc", revStr = "", str.length() = 3
Iteration 1: i = 2 (str.length() - 1)
ch = str.charAt(2) -> ch = 'c'
revStr = "" + "c" -> revStr = "c"
i becomes 1
Iteration 2: i = 1
ch = str.charAt(1) -> ch = 'b'
revStr = "c" + "b" -> revStr = "cb"
i becomes 0
Iteration 3: i = 0
ch = str.charAt(0) -> ch = 'a'
revStr = "cb" + "a" -> revStr = "cba"
i becomes -1
*/
