package Practice;

public class SwappingNumbers {
    public static void main(String[] args) {

        int x=5;
        int y=10;

        //1. with using third var : t
     //   int t;
     //   t=x;
     //   x=y;
     //   y=t;

        //2. without using third var:
        x=x+y; //15
        y=x-y; //5
        x=x-y; //10

        System.out.println(x);  // 10
        System.out.println(y);  // 5

      //3.  Multiplication and division can also be used for swapping:
        x = x * y;  // x now becomes 50
        y = x / y;  // y becomes 10
        x = x / y;  // x becomes 5
    }
}
