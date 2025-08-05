package LeetCode.SearchInsertPosition;
// Given a sorted array and a target value, return the index if the target is found.
// Time complexity is O(n)
public class Native_01_Solution {
    public static void main(String[] args){
        int[] inputArray = {1,2,5,6};
        int target = 2;

        System.out.println("Target should be inserted at index: " + Solution.searchInsert(inputArray, target));
    }
    public static class Solution{
        public static int searchInsert(int[] A, int target){
            // input array has no elements -> insert at index 0
            if(A==null) return 0;
            // input target in sorted array less than first element -> insert at index 0
            if(target<=A[0]) return 0;

            for(int i=0; i < A.length-1; i++){
                if(target > A[i] && target <= A[i+1]){
                    return i+1;
                }
            }
            return A.length;
        }
    }
}
