package Practice;

import java.util.Scanner;

public class Primenumbercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

         if(num<=1){
             System.out.println("Not prime");
             return;
         }
         if(num==2){
             System.out.println("Prime number");
             return;
         }

         for(int i=2;i<num;i++){
             if(num%i ==0){
                 System.out.println("Not prime");
                 return;
             }
         }
        System.out.println("Prime number");
    }
}
