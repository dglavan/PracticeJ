package LeetCode.ThreeSum;

import java.util.Arrays; // for Arrays.sort()
import java.util.*;

// For example, given array S = {-1 0 1 2 -1 -4}, target sum = 0 => a+b+c = 0;
// A solution set is:
// (-1, 0, 1)
// (-1, -1, 2)
// Naive solution is 3 loops, and this gives time complexity O(nˆ3).
public class Native_01_Solution {
    public static void main(String[] args){
        int[] input = {-1, 0, 1, 2, -1, -4};

        ArrayList<ArrayList<Integer>> output = Solution.threeSum(input);
        for(ArrayList<Integer> triplet : output){
            System.out.println(triplet);
        }
    }

    public static class Solution{
        public static ArrayList<ArrayList<Integer>> threeSum(int[] nums){
            //sort array
            Arrays.sort(nums);

            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

            // Outer Loop (i) -> element i is the first number in the triplet.
            for(int i=0; i < nums.length - 2; i++){
                // Skip duplicate values for i
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                // Second Loop (j) -> element j is the second number in the triplet.
                for(int j = i+1; j < nums.length - 1; j++){
                    // Skip duplicate values for j
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                    // Third Loop (k) -> element k is the third number in the triplet.
                    for(int k = j+1; k < nums.length; k++){
                        // Skip duplicate values for k
                        if (k > j + 1 && nums[k] == nums[k - 1]) continue;

                        if(nums[i] + nums[j] + nums[k] == 0){ // success case triplet with sum 0 found
                            //Create new array list to hold triplets with sum 0.
                            ArrayList<Integer> triplets = new ArrayList<Integer>();

                            triplets.add(nums[i]);
                            triplets.add(nums[j]);
                            triplets.add(nums[k]);
                            result.add(triplets); // store array list with valid triplets to result array of arrays
                        }
                    }
                }
            }
            return result;
        }
    }
}
