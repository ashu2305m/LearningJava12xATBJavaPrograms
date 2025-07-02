package Practice;

public class SwappingString {
    public static void main(String[] args) {

        // swap strings without using temp/third variable

        String a = "Hello";
        String b = "World";

        System.out.println("before swapping: ");
        System.out.println("the value of a is: "+a);
        System.out.println("the value of b is: "+b);

        //1. append a and b:
        a=a+b;  //HelloWorld

        //2. store initial string a in string b:
        b = a.substring(0, a.length()-b.length());

        //3. store initial string b in string a:
        a = a.substring(b.length());  // b.length()=5

        System.out.println("the value of a and b after swapping ");

        System.out.println("the value of a is: "+a);
        System.out.println("the value of b is: "+b);
    }
}
