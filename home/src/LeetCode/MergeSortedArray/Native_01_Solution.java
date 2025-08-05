package LeetCode.MergeSortedArray;
import java.util.Arrays;
// Given two sorted integer arrays A and B, merge B into A as one sorted array.
// You may assume that A has enough space to hold additional elements from B.
// The number of elements initialized in A and B are m and n respectively.
// The key to solve this problem is moving element of A and B backwards.
// If B has some elements left after A is done, also need to handle that case.

// In-place solution optimized for Space complexity: O(1) but Time complexity: O(m+n)
public class Native_01_Solution {
    public static void main(String[] args){
        int m = 3; // nr. elements in A
        int n = 4; // nr. elements in B

        int[] A = new int[m+n]; // allocating size of A to have capacity to hold elements of B
        A[0] = -1;
        A[1] = 2;
        A[2] = 3;

        int[] B = {-2, 0, 1, 4};
        Solution.merge(A, m, B, n);
        System.out.println(Arrays.toString(A));
    }
    public static class Solution{
        public static void merge(int[] A, int m, int[] B, int n){
            // Key optimization: move from back to front to avoid overwriting data in A
            while(m>0 && n>0){
                // Compare the last elements of initialized A and B.
                if(A[m-1] > B[n-1]){ // Case 1: last in A > last in B
                    A[m+n-1] = A[m-1];
                    m--; // move pointer accordingly inwards to check remaining elements (back to front)
                } else { // Case 2: last in B > last in A
                    A[m+n-1] = B[n-1];
                    n--; // move pointer accordingly inwards to check remaining elements (back to front)
                }
            }
            // case B has leftover elements
            while (n > 0){
                A[m+n-1] = B[n-1];
                n--;
            }
        }
    }
}
