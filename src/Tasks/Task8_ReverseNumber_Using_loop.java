package Tasks;

import java.util.Scanner;

public class Task8_ReverseNumber_Using_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        if(sc.hasNextInt()){
            int num= sc.nextInt();
            int revNum = 0;

            while (num>0){
                revNum= num%10 + revNum*10;
                num= num/10;

            }
            System.out.println(revNum);
        }
        else System.out.println("Please enter an integer only");
    }
}

/*
revNum = num % 10 + revNum * 10;
Example: If num is 123, 123 % 10 is 3.
revNum * 10
Example: If revNum is 5, 5 * 10 becomes 50.
Combined Example (for 123 input):
Iteration 1: num=123, revNum=0. digit = 123 % 10 = 3. revNum = 3 + 0 * 10 = 3.
Iteration 2: num=12, revNum=3. digit = 12 % 10 = 2. revNum = 2 + 3 * 10 = 32.
Iteration 3: num=1, revNum=32. digit = 1 % 10 = 1. revNum = 1 + 32 * 10 = 321.
num = num / 10;
Example: If num is 123, 123 / 10 becomes 12. If num is 12, 12 / 10 becomes 1.
If num is 1, 1 / 10 becomes 0.*/
