package LeetCode.LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

// Given an unsorted array of integers, find the length of the longest consecutive elements
// sequence. For example, given [100, 4, 200, 1, 3, 2], the longest consecutive elements
// sequence should be [1, 2, 3, 4]. Its length is 4. -> O(n) complexity.
public class Native_01_Solution {
    public static void main(String[] args){
        int[] input = {100, 4, 200, 1, 3, 2};
        System.out.println(longest(input));
    }
    public static int longest(int[] num){
        // if array is empty return 0
        if(num.length==0) return 0;
        // Creates a HashSet to store all numbers for O(1) lookups.
        Set<Integer> set = new HashSet<>();
        int max = 1;
        // Add All Elements to the Set
        for(int e : num){
            set.add(e);
        }

        for(int e : num){
            int left = e - 1; // first valid neighbour to left
            int right = e + 1; // first valid neighbour to right
            int count = 1; // start count from 1 (include start element)
            // for each element in set -> expand left(decrement 1)
        while(set.contains(left)){
            count++; // if consecutive neighbours are found increase count of consecutive
            set.remove(left); // remove valid to avoid future redundant work
            left--; // continue search to left neighbours
        }
            // or expand right(increment 1)
        while (set.contains(right)){
            count++;
            set.remove(right);
            right++;
        }
        max = Math.max(count, max);
        }
        return max;
    }
}
