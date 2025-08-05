package LeetCode.Rotate2DMatrix;
// You are given an n x n 2D matrix representing an image.
// Rotate the image by 90 degrees (clockwise).
public class Solution_01_PassByValue {
    public static void main(String[] args){
        int[][] input = {
                {1,2},
                {3,4}
        };
        Solution.rotate(input);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println(); // only after finishing a row
        }
    }
    public static class Solution{
        public static void rotate(int[][] matrix){
            if(matrix==null || matrix.length==0)
                return;

            int n = matrix.length;
            int[][] result = new int[n][n]; // Creates a new matrix to store the rotated version.

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    result[j][n-1-i] = matrix[i][j];
                    // i=0 , j=0 => result[0][1] <- matrix[0][0]
                    // i=0 , j=1 => result[1][1] <- matrix[0][1]
                    // i=1 , j=0 => result[0][0] <- matrix[1][0]
                    // i=1 , j=1 => result[1][0] <- matrix[1][1]
                }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    matrix[i][j] = result[i][j];
                }
            }
        }
    }
}
