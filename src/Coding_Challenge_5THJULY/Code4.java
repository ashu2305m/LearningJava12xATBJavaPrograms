package Coding_Challenge_5THJULY;

// Write a program that catches both `ArithmeticException` and `ArrayIndexOutOfBoundsException`.
public class Code4 {
    public static void main(String[] args) {

        int c =0;
        int b = 0;
        try {
            b = 10/c;
            String ip = args[0];
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

