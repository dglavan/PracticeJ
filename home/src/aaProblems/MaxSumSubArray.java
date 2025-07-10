package aaProblems;

// Kadane’s Algorithm --> Finding the maximum sum sub-array of a given array.
// Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4] --> Output : [4, -1, 2, 1]

public class MaxSumSubArray {
    public static void main(String[] args){

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = findMaxSubArray(nums);

        System.out.print("Maximum sum subarray: [");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
            if(i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int[] findMaxSubArray(int[] nums){
        int maxSoFar = nums[0];//Tracks the best (maximum) sum we've seen so far. Initialized to the first element.
        int maxEndingHere = nums[0]; //Tracks the sum of the current subarray ending at the current index.
        int start = 0, end = 0, // track indexes of best (Maximum) subarray
                tempStart = 0;  // track current candidate start

        for(int i=1; i<nums.length; i++){ //Start from index 1, because index 0 was already used to initialize variables.
            //If nums[i] alone is better than extending the current subarray,
            // we start a new subarray from index i
            if(nums[i] > maxEndingHere + nums[i]){
                maxEndingHere = nums[i];
                tempStart = i;
            }
            else { // Continue adding to the current subarray if it's beneficial.
                maxEndingHere += nums[i];
            }
            // update global max
            if(maxEndingHere > maxSoFar){
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }

        // Copy sub-array
        int[] result = new int[end - start +1]; //Allocate an array to store the result.
        for(int i=start; i<=end; i++){
            result[i-start] = nums[i];
        }
        return result;
    }
}
