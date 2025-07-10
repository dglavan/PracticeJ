package aaProblems;

import java.util.HashSet;
import java.util.Set;

public class MaxSumSubArrayUnique {

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, 5, -13, 11, -2, -1, -3, 112, 28, 20, 4, -6, 7, 11, 111, 1, -100, -1, 22, 23, -1, 11};
        int[] result = findMaxUniqueConsecutiveSubarray(array);

        // Printing Loop
        System.out.print("MaxSum Sub-array with unique consecutive elements: [");
        for(int i=0; i < result.length; i++){
            System.out.print(result[i]);
            if(i< result.length -1) System.out.print(", ");
        }
        System.out.print("]");
    }

    public static int[] findMaxUniqueConsecutiveSubarray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int maxStart = 0, maxEnd = 0; // track indexes for best array candidate

        for(int start = 0; start < nums.length; start++){ // Outer loop - Try EVERY start index

            // Create a new empty HashSet for this starting index to track seen elements.
            Set<Integer> seen = new HashSet<>();
            int sum = 0; // Initialize 0 to keep track of sum in each set (unique elements)

            for(int end = start; end < nums.length; end++){ // Inner Loop - Expand the sub-array to the right
                if(seen.contains(nums[end])){ // if current element has been seen , stop expand;
                    break; // stop when duplicate found
                }

                // Each current unique element is added to set and to current sum of this set
                seen.add(nums[end]);
                sum += nums[end];

                // Check current 'sum' > maxSum -> if yes -> UPDATE maxSum, maxStart, maxEnd
                if(sum>maxSum){
                    maxSum = sum; //
                    maxStart = start;
                    maxEnd = end;

                }
            }
        }

        // Extract result sub-array
        int[] result = new int[maxEnd - maxStart +1];
        for(int i = maxStart; i <= maxEnd; i++){
            result[i-maxStart]=nums[i];
        }

        return result;
    }
}
