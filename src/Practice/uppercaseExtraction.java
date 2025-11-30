package Practice;

public class uppercaseExtraction {
    public static void main(String[] args) {
        String str = "My Name IS AShutosh";
        StringBuilder output = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                output.append(ch);
            }
        }

        System.out.println("Output: " + output.toString() + " - " + output.length());
    }
}
