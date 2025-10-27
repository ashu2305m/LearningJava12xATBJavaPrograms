package Practice;

public class Largestprefix {
        public static void main(String[] args) {
            String[] words = {"flower", "flow", "flight"};

            String prefix = ""; // Start with empty answer

            for (int i = 0; i < words[0].length(); i++) {
                char ch = words[0].charAt(i); // Take each letter from first word

                for (int j = 1; j < words.length; j++) {
                    // If word is too short or letter doesn't match
                    if (i >= words[j].length() || words[j].charAt(i) != ch) {
                        System.out.println("Longest Common Prefix: " + prefix);
                        return;
                    }
                }

                prefix += ch; // Add matching letter to answer
            }

            System.out.println("Longest Common Prefix: " + prefix);
        }
    }


