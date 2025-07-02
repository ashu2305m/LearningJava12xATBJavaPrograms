package Practice;

/*Java code: Input: int[]={1,2,0,3,5,0,4,0,0} Output: int[]={1,2,3,4,5,0,0,0,0}
All zero should be at the end*/

import java.util.Arrays;

public class StringQuestion6_ZeroesAtEnd {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 3, 5, 0, 4, 0, 0};
        int count = 0;
        for(int i = 0; i < nums.length; i++){
         if(nums[i] != 0){
             nums[count++] = nums[i];
         }
        }

        while(count<nums.length){
            nums[count++] = 0;
        }

        // Print the modified array to show the result
        System.out.println("Modified Array: " + Arrays.toString(nums));
    }
}
