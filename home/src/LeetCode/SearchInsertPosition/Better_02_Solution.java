package LeetCode.SearchInsertPosition;
// Use binary search logic
public class Better_02_Solution {
    public static void main(String[] args){
        int[] inputArray = {1,2,5,6};
        int target = 2;

        System.out.println("Target should be inserted at index: " + Solution.searchInsert(inputArray, target));
    }
    public static class Solution{
        public static int searchInsert(int[] A, int target){
            if(A==null || A.length==0) return 0;
            // Allows recursion with custom bounds (start, end) without exposing that complexity to the caller
        //Calls the recursive helper method searchInsert() with the full range of the array (start = 0, end = A.length - 1).
            return searchInsert(A, target, 0, A.length-1);
        }
        // Defines a recursive helper method to perform a binary search within the subarray from start to end.
        private static int searchInsert(int[] A, int target, int start, int end){
            int mid = (start+end) / 2;
            // If the target is exactly at the middle, return that index.
            if(target==A[mid]){
                return mid;
            }
            else if(target<A[mid]){
                // If start < mid, recursively search the left half. -> end : mid-1 recurse left -1 index as end
                // If not, return start — this is where the target should be inserted.
                return start<mid?searchInsert(A, target, start, mid-1):start;
            }
            else{
                // If end > mid, recursively search the right half. -> start : mid+1 recurse right +1 index as start
                // If not, return end + 1, which is the next position after end.
                return end>mid?searchInsert(A, target, mid+1, end):(end+1);
            }
        }
    }
}
