package ex_14_Strings;

public class LabStringExamples {
    public static void main(String[] args) {

        String s= "Java";
        char c = s.charAt(2);
        // Index = 0, ->
        System.out.println(c);

        System.out.println(s.codePointAt(0)); // It prints the unicode character of letter at index-0 here its J=74

        // CompareToIgnore(Sting sr)
//        int result = "abc".compareTo("ABC");
//        int result2 = "abc".compareToIgnoreCase("ABC");
//        System.out.println(result); // any arbitrary number
//        System.out.println(result2); // since its int so it cant print true which is boolean so it will print 0 for matching value
//

        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); // 3


        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("z-", "Java", "Python");
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

    }
}
