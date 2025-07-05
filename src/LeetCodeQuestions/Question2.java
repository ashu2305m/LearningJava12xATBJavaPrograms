package LeetCodeQuestions;

import java.util.Arrays;

// Remove Element
public class Question2 {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        System.out.println(nums[count]);
        System.out.println("Array after removal: " + Arrays.toString(Arrays.copyOf(nums, count)));
    }
}
