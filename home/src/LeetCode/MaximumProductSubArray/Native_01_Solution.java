package LeetCode.MaximumProductSubArray;
// Find the contiguous subarray within an array (containing at least one number) which
// has the largest product.
// For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has the largest
// product = 6.
// time complexity is O(n³)

public class Native_01_Solution {
    public static void main(String[] args){
        int[] A = {2, 3, -2, 4};
        System.out.println(maxProduct(A));
    }
    public static int maxProduct(int[] A){
        int max = Integer.MIN_VALUE;
        // Define all possible sub-arrays using two pointers i , j
        // each Sub Array starts at index i and ends at index j;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){ // The inner loop j runs from 0 to A.length - i - 1
                // condition to prevent out of bounds subarrays => i+j < 4(this case)
                if(i+j<A.length){
                    int product = calcProd(A, i, j);
                    max = Math.max(product,max);
                }
            }
        }
        return max;
    }

    public static int calcProd(int[] A, int i, int j){
        int result = 1;
        for(int m = i; m<=j; m++){ // start at i - end at j
            result = result * A[m]; // multiply all in between i,j indexes
        }
        return result;
    }
}
