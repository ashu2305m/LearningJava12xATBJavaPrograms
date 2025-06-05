package Tasks;

public class Task17_CountNoOfWords {
    public static void main(String[] args) {
        String str = "Why So Serious Buddy !";

        String[] words = str.split("\\s+");
        System.out.println("Number of words: "+words.length);
    }
}
