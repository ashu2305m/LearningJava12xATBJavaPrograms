package Practice;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String current = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));

            if (current.contains(ch)) {
                // Remove characters from the start until the repeated one is gone
                int index = current.indexOf(ch);
                current = current.substring(index + 1);
            }

            current += ch; // Add current character
            maxLength = Math.max(maxLength, current.length());
        }

        System.out.println("Longest length: " + maxLength);
    }
}

