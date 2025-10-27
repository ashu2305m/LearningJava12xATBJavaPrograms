package Practice;
import java.util.HashMap;

public class LongestUniqueSubstring2 {
    public static void main(String[] args) {
        String str = "abcabcbb";

        int start = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            char curr = str.charAt(end);

            // If character is already seen and is inside the current window
            if (map.containsKey(curr) && map.get(curr) >= start) {
                start = map.get(curr) + 1; // Move start past the previous occurrence
            }

            map.put(curr, end); // Update character's latest index
            max = Math.max(max, end - start + 1); // Update max length
        }

        System.out.println("Longest length: " + max);
    }
}

