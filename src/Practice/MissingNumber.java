package Practice;

public class MissingNumber {
        public static void main(String[] args) {

            int[] num = {1, 2, 4, 5, 6};       // Missing 3
            int[] num1 = {1, 2, 3, 4, 5, 6};   // Full array

            int sum = 0;
            int sum1 = 0;

            // Sum of full array
            for (int i = 0; i < num1.length; i++) {
                sum1 += num1[i];
            }

            // Sum of array with missing number
            for (int i = 0; i < num.length; i++) {
                sum += num[i];
            }

            System.out.println("The missing number is -> " + (sum1 - sum)  );
        }
    }
