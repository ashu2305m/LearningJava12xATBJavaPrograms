package Practice;

public class ReverseNumber {
    public static void main(String[] args) {
        long num = 12345;
        long rev = 0;

        while(num!=0){
            rev = num%10 + rev*10;
            num = num/10;
        }
        System.out.println(rev);
    }
}
