package Tasks;

import java.util.Scanner;

public class Task12_ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer number");

        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(isArmstrong(num))
            System.out.println(num  + " is an armstrong number");
        else
            System.out.println(num  + " is not an armstrong number");
    }
    public static boolean isArmstrong(int num){
        int ams=0,  x = 0, temp=num;
        int numLen = String.valueOf(num).length();
        System.out.println("num length =" +numLen);
        while(num>0)
        {
            x=num%10;
            ams= (int) (ams + Math.pow(x,numLen));
            num=num/10;
        }
        System.out.println(ams + " " + temp);
        if(ams==temp)
            return true;
        else
            return false;
    }
}
