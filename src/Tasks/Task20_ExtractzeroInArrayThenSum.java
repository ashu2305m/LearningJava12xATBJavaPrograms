package Tasks;

public class Task20_ExtractzeroInArrayThenSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 5, 0, 1}; // Original array


        System.out.println("Original array:");
        // Loop to print the original array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line for formatting

        // Call the method to move zeros
        moveZerosToEnd(arr);

        System.out.println("Array after moving zeros:");
        // Loop to print the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();// New line for formatting

    }

    // Method to move all zeros to the end of an array
    static void moveZerosToEnd(int[] arr) { // Parameter: the array to be modified
        int nonZeroPointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) { // 3
                arr[nonZeroPointer] = arr[i];
                nonZeroPointer++;
            }
        }

        for (int i = nonZeroPointer; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}

