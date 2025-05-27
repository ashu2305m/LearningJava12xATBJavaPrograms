package ex_12_DoWhile;

public class Lab127_DoWhile_REAL {
    public static void main(String[] args) {
        // Web Automation     It is used when we want to execute command atleast once
        int number = 0;
        // 0 -> it can be 0 to 10 - elements or students
        do{
            System.out.println(number);
            // callFunction(number);
            // close the excel file, open the file.
            number++;
        }while (number < 0);

    }
}
