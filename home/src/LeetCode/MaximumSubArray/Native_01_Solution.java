package LeetCode.MaximumSubArray;
// This code implements Kadane’s Algorithm to solve the Maximum Subarray Problem efficiently
//  O(n) time.
// Find the contiguous subarray within an array (containing at least one number) which
// has the largest sum.
// For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1]
// has the largest sum = 6.

public class Native_01_Solution {
    public static void main(String[] args){
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Solution.maxSubArray(input));
    }
    public static class Solution{
        public static int maxSubArray(int[] A){
            int newSum = A[0];
            int maxSum = A[0];

            for(int i=1; i<A.length;i++){
                newSum = Math.max(newSum+A[i],A[i]);
                maxSum = Math.max(maxSum, newSum);
            }
            return maxSum;
        }
    }
}
