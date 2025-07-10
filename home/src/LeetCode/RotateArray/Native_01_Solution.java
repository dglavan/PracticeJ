package LeetCode.RotateArray;

// Space is O(n) and time is O(n).

// Problem: Rotate an array of n elements to the right by k steps. For example, with
// n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

import java.util.Arrays;

public class Native_01_Solution {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        int k = 3; // order of rotation
        System.out.println(Arrays.toString(rotate(array, 3)));
    }

    public static int[] rotate(int[] nums, int k){
        if(k > nums.length) k=k%nums.length;

        int[] result = new int[nums.length]; // declaration of new result array - size of input array

        // Get last K elements from input array and add them at beginning of result array
        for(int i=0; i < k; i++){
            result[i] = nums[nums.length -k +i]; // add last k elements from nums to result at index 0,1,2
        }

        int j = 0;
        for(int i = k; i < nums.length ; i++){ // start index k = 3 to end -> rest of elements (n-k)
            result[i] = nums[j]; // continue from k=3 index to add elements (read from 0 index of original array)
            j++;
        }
        // From src 'result' starting at 0 index  -> to destination 'nums' starting at 0 index -> nums.length=7 elem.
        System.arraycopy(result, 0, nums, 0, nums.length);
        return nums;
    }
}
