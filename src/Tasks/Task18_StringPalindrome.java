package Tasks;

public class Task18_StringPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String revStr="";

        for (int i=str.length()-1;i>=0;i--)
        {
             char ch =str.charAt(i);
          revStr= revStr+String.valueOf(ch);
        }
        if(str.equals(revStr)) {
            System.out.println("String is palindrome");
        }else {
            System.out.println("String in not a palindrome");
        }
    }
}
