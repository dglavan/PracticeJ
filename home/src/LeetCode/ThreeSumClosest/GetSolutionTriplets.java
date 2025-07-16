package LeetCode.ThreeSumClosest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class GetSolutionTriplets {
    public static void main(String[] args){
        int[] input = {-1, 2, 1, -4, -5, 11};
        int targetSum = 1;
        ArrayList<ArrayList<Integer>> result = threeSumClosest(input, targetSum);

        ArrayList<Integer> first = result.getFirst();
        int closestSum = 0;
        for(int n : first){
            closestSum += n;
        }
        System.out.println("Closest Sum to Target: " + closestSum + " resulting from following triplets:");
        for(ArrayList<Integer> triplet : result){
            System.out.println(triplet);
        }
    }
    public static ArrayList<ArrayList<Integer>> threeSumClosest(int[] nums, int target){
        int minDiff = Integer.MAX_VALUE;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        HashSet<ArrayList<Integer>> uniqueTriplets = new HashSet<ArrayList<Integer>>();
        // sort input array -> needed for two pointer method search below
        Arrays.sort(nums);

        for(int i = 0; i < nums.length -2; i++){ // Outer loop -> to find first nr in triplet
            int start = i + 1 ; // 2nd element in triplet
            int end = nums.length - 1 ; // 3rd element in triplet


            while (start < end){

                int sum = nums[i] + nums[start] + nums[end];
                int diff = Math.abs(sum - target);

                //Initialize starting triplet as reference
                ArrayList<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i],nums[start],nums[end]));
                Collections.sort(triplet);
                
                // If Closer: Clear Previous, Store New Closest Triplet , Update minDiff
                if(diff < minDiff){
                    uniqueTriplets.clear();
                    result.clear();
                    uniqueTriplets.add(triplet);
                    result.add(triplet);
                    minDiff = diff;

                // If Same Closeness: Add New Unique Triplet
                } else if (diff == minDiff && !uniqueTriplets.contains(triplet)) {
                    uniqueTriplets.add(triplet);
                    result.add(triplet);
                    
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
