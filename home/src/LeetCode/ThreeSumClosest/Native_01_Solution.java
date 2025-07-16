package LeetCode.ThreeSumClosest;

import java.util.Arrays;

// Given an array S of n integers, find three integers in S such that the sum is closest to target.
// Return the sum of the three integers. You may assume that each input would have exactly one solution.
// For example, given array S = -1 2 1 -4, and target = 1. The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Time Complexity is O(nˆ2).
public class Native_01_Solution {
    public static void main(String[] args){
        int[] input = {-1, 2, 1, -4};
        int targetSum = 1;

        int result = threeSumClosest(input, targetSum);
        System.out.println(result);
    }
    public static int threeSumClosest(int[] nums, int target){
        int min = Integer.MAX_VALUE;
        int result = 0;
        // sort input array -> needed for two pointer method search below
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){ // Outer loop -> to find first nr in triplet
            int start = i + 1 ; // 2nd element in triplet
            int end = nums.length - 1 ; // 3rd element in triplet

            while (start < end){
                int sum = nums[i] + nums[start] + nums[end];
                int diff = Math.abs(sum - target);

                // perfect solution - exact match - return early
                if(diff == 0) return sum;
                // update diff to lowest => update result to sum (closest to target)
                if(diff < min){
                    min = diff;
                    result = sum;
                }

                // move pointers
                if(sum <= target){ // too small -> move left pointer
                    start++;
                } else { // too big -> move right pointer
                    end--;
                }
            }
        }
        return result;
    }
}
