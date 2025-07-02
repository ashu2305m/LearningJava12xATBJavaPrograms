package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        String str = sc.next();
        String reverse = "";


        for(int i=str.length()-1; i>=0;i--){
            reverse = reverse + str.charAt(i);
            System.out.println();
        }


        if(str.equals(reverse))
            System.out.println("String is palindrome");
        else System.out.println("String in not a palindrome");
    }
    }

