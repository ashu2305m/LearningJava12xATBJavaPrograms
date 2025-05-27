package Tasks;

/*Write a program that calculates and displays the letter grade for a given numerical score
(e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59*/

public class Task7_Grade_Calculator{
    public static void main(String[] args) {
      for(int i=0;i<=100;i++){
          if(i>=90){
              System.out.println("The Grade is-> A");
              System.out.println(i);
          } else if (i>=80 && i<=89) {
              System.out.println("The Grade is-> B");
              System.out.println(i);
          }else if (i>=70 && i<=79) {
              System.out.println("The Grade is-> C");
              System.out.println(i);
          }else if (i>=60 && i<=69) {
              System.out.println("The Grade is-> D");
              System.out.println(i);
          }else{
              System.out.println("The Grade is-> F");
              System.out.println(i);
          }
      }
    }
}
