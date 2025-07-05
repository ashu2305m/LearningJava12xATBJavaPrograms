package Practice;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String s = "00012345";
        //The ^ at the very beginning means "the match must start at the beginning of the string s.
        // " So, 0+ will only match if the zeros are at the very start.
        s = s.replaceFirst("^0+(?!$)", "");
        System.out.println(s);
    }
}
