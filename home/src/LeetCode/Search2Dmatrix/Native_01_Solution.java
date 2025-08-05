package LeetCode.Search2Dmatrix;
// Write an efficient algorithm that searches for a value in an m x n matrix. This matrix
// has properties:
//1) Integers in each row are sorted from left to right.
//2) The first integer of each row is greater than the last integer of the previous row.
// [1, 3, 5, 7],
// [10, 11, 16, 20],
// [23, 30, 34, 50]
// Given target = 3, return true.
// Matrix is 2D-Array sorted -> Using binary search as if it were a flat 1D array.
// 2D (i,j) -> 1D Index = i * n + j where i = row index , j = col index , 1D Index = mid1D
// i = 1D Index / n , j = 1D index % n
public class Native_01_Solution {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        System.out.println(Solution.searchMatrix(matrix, 3));
    }
    public static class Solution{
        public static boolean searchMatrix(int[][] matrix, int target){
            if(matrix==null || matrix.length==0 || matrix[0].length==0){
                return false;
            }

            int m = matrix.length; // nr. rows = 3
            int n = matrix[0].length; // nr. columns = 4

            int start = 0;
            int end = m*n-1;

            while (start<end){
                // Middle index in 1D space.
                int mid = (start + end)/2;

                int midX = mid / n; // Row index. How many rows(full col offset) are before mid
                int midY = mid % n; // Column index. Column offset in that row

                // Found target case
                if(matrix[midX][midY] == target){
                    return true;
                }
                // Search mechanism
                if(matrix[midX][midY] < target){
                    start = mid+1; // move right (check mid of right half)
                }
                else {
                    end = mid-1; // move left (check mid of left half)
                }
            }
            return false;
        }
    }

}
