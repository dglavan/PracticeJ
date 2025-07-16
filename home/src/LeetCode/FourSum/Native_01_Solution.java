package LeetCode.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target?
// Find all unique quadruplets in the array which gives the sum of target.
// For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
// A solution set is: (-1, 0, 0, 1) , (-2, -1, 1, 2) , (-2, 0, 0, 2)
// A typical k-sum problem. Time is N to the poser of (k-1).
public class Native_01_Solution {
    public static void main(String[] args){
        int[] S = {1, 0, -1, 0, -2, 2};
        int target = 0;
        ArrayList<ArrayList<Integer>> output = fourSum(S,target);
        for(ArrayList<Integer> i : output ){
            System.out.println(i);
        }
    }

    public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target){
        //sort array
        Arrays.sort(nums);

        HashSet<ArrayList<Integer>> uniqueSol = new HashSet<ArrayList<Integer>>(); // keeps track of unique quadruples
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); // memorizes valid unique results

        for(int i = 0; i < nums.length; i++){ // Outer Loop -> gets valid first number
            for(int j = i+1; j < nums.length; j++){ // Inner Loop -> gets valid second number
                int start = j + 1; // first pointer from beginning -> gets valid third number
                int end = nums.length - 1; // second pointer from end -> gets valid fourth number

                while (start < end){
                    int sum = nums[i] + nums[j] + nums[start] + nums[end]; // current sum to check vs input target

                    // case 1 - sum is too large -> decrement end pointer to check lower sums
                    if(sum > target) {
                        end--;
                        // case 2 - sum is too small -> increment start pointer to check higher sums
                    } else if (sum < target) {
                        start++;
                        // case 3 - found sum = target -> add elements to result and result to uniqueSol set
                    } else if (sum == target) {
                        ArrayList<Integer> tmpSol = new ArrayList<Integer>();
                        tmpSol.add(nums[i]);
                        tmpSol.add(nums[j]);
                        tmpSol.add(nums[start]);
                        tmpSol.add(nums[end]);

                        if(!uniqueSol.contains(tmpSol)){ // check if unique condition to memorize
                            uniqueSol.add(tmpSol); // add to uniqueSol tracker set
                            result.add(tmpSol); // add unique quadruple to result
                        }
                        // after valid solution -> move pointers inwards to continue search for other solutions
                        start++;
                        end--;
                    }
                }
            }
        }
        return result;
    }
}
