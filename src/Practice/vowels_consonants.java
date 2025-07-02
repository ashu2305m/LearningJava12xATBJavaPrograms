package Practice;

import java.util.Scanner;

public class vowels_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.next().toLowerCase();
        int vowels = 0;
        int consonant = 0;

        for(int i =0; i<=str.length()-1;i++){
           char ch = str.charAt(i);
               if(Character.isLetter(ch)){
                   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                       vowels++;
                   }else {
                       consonant++;
                   }
            }else{
                   System.out.println("Please enter only Alphabets");
               }
        }
        System.out.println("count of vowels -> "+vowels);
        System.out.println("count of consonants -> "+consonant);
    }
}
