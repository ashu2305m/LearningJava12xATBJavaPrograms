package Coding_Challenge_21STJUNE;

/*- Use comparison operators (==, !=, <, >, <=, >=)
- Use logical operators (&&, ||, !)*/
public class Code3 {
    public static void main(String[] args) {
        int sum = 22;
        int product = 56;
        int minus = 98;

        if(sum==minus){
            System.out.println("sum and minus are same");
        } else if (sum!=minus) {
            System.out.println("sum and minus are not same");
        } else if (sum==minus && sum==product) {
            System.out.println("sum, minus and product all are same");
        } else if (sum>minus) {
            System.out.println("sum is greater than minus");
        } else if (sum<minus) {
            System.out.println("minus is greater than sum");
        } else if (sum!=minus) {
            System.out.println("sum and minus are not equal");
        } else if (sum==minus || sum==product) {
            System.out.println("either sum and minus are equal or sum and product are equal");
        }
    }
}
