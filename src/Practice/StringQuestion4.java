package Practice;

/*Input: tomorrow
Output: t3m3223w*/
public class StringQuestion4 {
    public static void main(String[] args) {
       String input = "tomorrow";
       StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch == 'o') { // Check if the character is 'o' (the letter, not zero)
                output.append('3'); // Append '3' to the StringBuilder
            } else if (ch == 'r') { // Check if the character is 'r'
                output.append('2'); // Append '2' to the StringBuilder
            } else {
                // If no specific rule applies, append the original character
                output.append(ch);
            }
       }

        System.out.println("Output is :" +output.toString());
    }
}
