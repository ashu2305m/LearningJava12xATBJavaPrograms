package Practice;

public class StringCharacterAnalysis {
    public static void main(String[] args) {
        String str1 = "I love java programming #$%&#  234658";
        String str = str1.toLowerCase();
        String vowels = "";
        String consonants = "";
        String digits = "";
        String specialChars = "";

        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                    vowels += ch;
                } else {
                    consonantCount++;
                    consonants += ch;
                }
            } else if (Character.isDigit(ch)) {
                digits += ch;
            } else  {
                specialChars += ch;
            }
        }

        // Output
        System.out.println("Original String: " + str);
        System.out.println("Vowels (" + vowelCount + "): " + vowels);
        System.out.println("Consonants (" + consonantCount + "): " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
}


