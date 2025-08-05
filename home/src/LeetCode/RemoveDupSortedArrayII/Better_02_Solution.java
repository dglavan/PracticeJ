package LeetCode.RemoveDupSortedArrayII;

public class Better_02_Solution {
    public static void main(String[] args){
        int[] A = {1, 1, 1, 2, 2, 3};
        System.out.println(Solution.removeDup(A));
    }
    public static class Solution{
        public static int removeDup(int[] A){
            if(A.length<=2) return A.length;

            int prev = 1; // Tracks where to write the next allowed element
            int curr = 2; // Iterates through the array from the 3rd element onward

            while (curr < A.length){
                // Skip if already seen twice
                if(A[curr] == A[prev] && A[curr] == A[prev-1]){
                    curr++; // just move search forward
                } else { // if new or seen just once
                    prev++; // move writing position tracker forward - to write valid value there
                    A[prev]=A[curr]; // write valid value at new writing position
                    curr++; // move search forward
                }
            }
            return prev+1;
        }
    }
}
