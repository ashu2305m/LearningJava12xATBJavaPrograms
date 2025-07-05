package Practice;

import java.util.Arrays;

//Input: int[]={1,2,0,3,5,0,4,0,0} Output: int[]={1,2,3,4,5,0,0,0,0} All zero should be at the end

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        // Example array with zeros randomly distributed
        int[] nums = {1, 0, 2, 0, 3, 0, 4, 0, 5,};

        // Print the original array to see the initial state
        System.out.println("Original Array: " + Arrays.toString(nums));

        int count = 0;
        for(int i=0; i < nums.length; i++){
            if(nums[i] !=0){
                nums[count++] = nums[i];
            }
        }
        while(count < nums.length){
            nums[count++] = 0;
        }

        System.out.println("Modified Array: " + Arrays.toString(nums));
    }
}



