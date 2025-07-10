package LeetCode.RotateArray;

// Efficiency : O(1) space and in O(n) time Best

// Problem: Rotate an array of n elements to the right by k steps. For example, with
// n = 7 and k = 3 , the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

//Assuming we are given 1,2,3,4,5,6,7 and order 2. The basic idea is:
//1. Divide the array two parts: 1,2,3,4 and 5,6,7
//2. Rotate first part: 4,3,2,1,5,6,7
//3. Rotate second part: 4,3,2,1,7,6,5
//4. Rotate the whole array: 5,6,7,1,2,3,4


import java.util.Arrays;

public class Reversal_03_Solution_Best {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        int k = 3; // order of rotation
        System.out.println(Arrays.toString(rotate(array,k)));
    }

    public static int[] rotate(int[] nums, int order){
        // special case order > n (length of array)
        order = order % nums.length;

        // arguments should not be null array or negative order
        if(nums == null || order<0) throw new IllegalArgumentException("Illegal argument!");

        int a = nums.length - order; //1. Divide the array two parts: 1,2,3,4 and 5,6,7

        reverse(nums, 0, a-1); //2. Rotate first part: 4,3,2,1,5,6,7
        reverse(nums, a, nums.length -1); //3. Rotate second part: 4,3,2,1,7,6,5

        // Return result from final rotation for entire array - after first two parts were reversed
        return reverse(nums, 0, nums.length -1); //4. Rotate the whole array: 5,6,7,1,2,3,4
    }
    // Helper function 'reverse' takes input array(min 2 elements), start index, end index -> performs reversal
    public static int[] reverse(int[] nums, int start, int end){
        // reverse only if min 2 elements inside input array
        if (nums==null || nums.length==1) throw new IllegalArgumentException("Provided array must have 2 elements!");

        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
