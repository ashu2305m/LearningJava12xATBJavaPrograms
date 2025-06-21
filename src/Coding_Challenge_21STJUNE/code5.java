package Coding_Challenge_21STJUNE;

/***Requirements:**
        - Show operator precedence with complex expressions
- Demonstrate implicit and explicit type casting*/
public class code5 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
//        short s = phone_no; // Narrowing - implicit
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s);

        byte b = 10;
        int a = b; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a1 = (int)b; // Widening Explicit Casting (int) - optional
    }
}
