package LeetCode.MaximumProductSubArray;
// O(n) time
public class Dynamic_Prog_02_Solution {
    public static void main(String[] args){
        int[] A = {2, 3, -2, 4};
        System.out.println(maxProduct(A));
    }
    public static int maxProduct(int[] A){
        // If the array is null or empty, return 0.
        if(A==null || A.length==0) return 0;

        int maxLocal = A[0]; // max product ending at current index
        int minLocal = A[0]; // min product ending at current index (important due to negatives)
        int global = A[0]; // max product seen so far (result)

        for(int i=1; i<A.length; i++){
            int temp = maxLocal; // Needed because minLocal update uses the original maxLocal.
            // Case 1. Extend previous max product: A[i] * maxLocal
            // Case 2. Start new subarray: A[i]
            // Case 3. Extend previous min product (in case A[i] is negative): A[i] * minLocal
            maxLocal = Math.max(Math.max(A[i]*maxLocal, A[i]), A[i]*minLocal);

            minLocal = Math.min(Math.min(A[i]*temp, A[i]), A[i]*minLocal);
            global = Math.max(global, maxLocal);
        }
        return global;
    }
}
