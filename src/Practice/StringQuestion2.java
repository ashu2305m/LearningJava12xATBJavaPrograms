package Practice;

/*Write a java program for the given string input = " abcd1234@ #%"
and give split the output with Alphabets, Digits, Special Characters.*/
public class StringQuestion2 {
    public static void main(String[] args) {
        String input = "abcd1234@#%";

        StringBuilder alphabets = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                specialChars.append(ch);
            }
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
}
