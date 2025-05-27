package ex_11_While;

public class Lab120_While_Check {
    public static void main(String[] args) {
        int i = 0;
        while (i < 0) {    // condition not satisfied so no output
            System.out.println(i);
            i++;
        }
    }
}
