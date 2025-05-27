package Tasks;

import java.util.Scanner;

public class Task2_Triangles_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n1: ");
        int n1 = scanner.nextInt();

        System.out.println("n2: ");
        int n2 = scanner.nextInt();

        System.out.print("n3: ");
        int n3 = scanner.nextInt();

        if(n1==n2 && n2==n3 && n1==n3){
            System.out.println("This is an Equilateral Triangle");
        } else if (n1==n2 || n1==n3 ||n2==n3 ){
            System.out.println("This is an Isosceles Triangle");
        }else{
            System.out.println("This is an Scalene Triangle");
        }



    }
}
