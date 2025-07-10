package LeetCode.RotateArray;

// Space is O(1) and time is O(n*k).

// Problem: Rotate an array of n elements to the right by k steps. For example, with
// n = 7 and k = 3 , the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

import java.util.Arrays;

public class BubbleRotate_02_Solution {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        int k = 3; // order of rotation
        System.out.println(Arrays.toString(brotate(array, 3)));
    }

    public static int[] brotate(int[] nums, int k){
        //special case order > n (length of array)
        k = k % nums.length;

        // protection against null array and negative order of rotation
        if(nums == null || k <0) throw new IllegalArgumentException("Illegal Argument!");

        // Bubble Rotate Array - using Outer Loop ( 3 full rotations ) + Inner Loop (bubble rotate last pushed to first)
        for(int i = 0; i < k; i++){ // pointer from start going forward ( Outer loop ensures k complete rotations )
            // Inner loop starts from last element and brings it front with j rotations with prev element each time
            for(int j = nums.length - 1; j > 0; j--){ // j=6 : {1,2,3,4,5,6,7} -> {1,2,3,4,5,7,6}
                int temp = nums[j];                   // j=5 : {1,2,3,4,5,7,6} -> {1,2,3,4,7,5,6}
                nums[j] = nums[j-1];                  // j=4 : {1,2,3,4,7,5,6} -> {1,2,3,7,4,5,6}...
                nums[j-1] = temp;                     // j=1 : {1,7,2,3,4,5,6} -> {7,1,2,3,4,5,6}
                // i=0 => {7,1,2,3,4,5,6} ; i=1 => {6,7,1,2,3,4,5} ; i=2 => {5,6,7,1,2,3,4}
            }
        }
        return nums;
    }

}
