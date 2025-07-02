package Practice;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String s = "00012345";
        s = s.replaceFirst("^0+(?!$)", "");
        System.out.println(s);
    }
}
