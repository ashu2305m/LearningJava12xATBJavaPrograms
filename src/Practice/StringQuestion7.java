package Practice;

// Remove all the junk/ special chars in a string

public class StringQuestion7 {
    public static void main(String[] args) {

        String s = "#%$#^#@# learning java 12345";

        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
