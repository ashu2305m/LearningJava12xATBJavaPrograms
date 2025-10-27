package Practice;

import java.util.Arrays;
// An anagram is a word or phrase formed by rearranging the letters of another word or phrase,
// using all the original letters exactly once

public class Anagram {
    public static void main(String[] args) {
        String str1 = "army";
        String str2 ="mary";

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2= str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Given Strings are Anagram");
        } else{
            System.out.println("Given Strings are not Anagram");
        }

    }
}
