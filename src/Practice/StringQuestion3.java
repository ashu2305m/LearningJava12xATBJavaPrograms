package Practice;

/*Java Coding Challenge:
        🔸 Input: "I Love Java Programming"
        🔸 Expected Output: "I Love Java gnimmargorP"*/
public class StringQuestion3 {
    public static void main(String[] args) {
         String input = "I Love Java Programming";
         String[] words = input.split(" ");
        String lastWord = words[words.length - 1];// Get the last word
        String reversedLastWord = new StringBuilder(lastWord).reverse().toString(); // Reverse the last word


        // Reconstruct the string
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            output.append(words[i]).append(" ");
        }
        output.append(reversedLastWord);

        System.out.println(output.toString()); // Prints "I Love Java gnimmargorP"
    }
}
