package Practice;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "My name is Ashutosh";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse()).append(" ");
        }

        System.out.println("Reversed sentence: " + result.toString().trim());
}
}
