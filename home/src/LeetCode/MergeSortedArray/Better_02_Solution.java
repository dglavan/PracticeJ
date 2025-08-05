package LeetCode.MergeSortedArray;

import java.util.Arrays;

public class Better_02_Solution {
    public static void main(String[] args){
        int m = 3;
        int n = 4;
        int[] A = new int[m+n];

        A[0] = -1;
        A[1] = 2;
        A[2] = 3;

        int[] B = {-2, 0, 1, 4};
        merge(A, m, B, n);
        System.out.println(Arrays.toString(A));
    }
    public static void merge(int[] A, int m, int[] B, int n){
        int i = m-1; // last valid element in A
        int j = n-1; // last element in B
        int k = m+n-1; // last position in array A (including extra space)

        while (k >= 0){ // Continue placing elements from the back of the array until k reaches 0.
            if(j < 0 || (i>=0 && A[i] > B[j])){//if B out of elements -> copy from A  or if last in A > last in B copy from A
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
    }
}
