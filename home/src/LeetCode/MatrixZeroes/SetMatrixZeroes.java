package LeetCode.MatrixZeroes;
// Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
// 1. check if first row and column are zero or not
// 2. mark zeros on first row and column
// 3. use mark to set elements
// 4. set first column and row by using marks in step 1
public class SetMatrixZeroes {
    public static void main(String[] args){
        int m = 3, n = 3;
        int[][] matrix = new int[m][n];

        matrix[0][0] = 1; matrix[0][1] = 0; matrix[0][2] = 3;
        matrix[1][0] = 1; matrix[1][1] = 4; matrix[1][2] = 3;
        matrix[2][0] = 4; matrix[2][1] = 5; matrix[2][2] = 8;
        System.out.println("Original matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Solution.setZeroes(matrix);
        // Print the matrix
        System.out.println("Matrix after setting zeroes:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static class Solution{
        public static void setZeroes(int[][] matrix){
            int m = matrix.length;
            int n = matrix[0].length;

            boolean[] zeroRows = new boolean[m];
            boolean[] zeroCols = new boolean[n];

            // First pass: mark rows and columns to be zeroed
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        zeroRows[i] = true;
                        zeroCols[j] = true;
                    }
                }
            }

            // Second pass: set zeroes based on markers
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (zeroRows[i] || zeroCols[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
