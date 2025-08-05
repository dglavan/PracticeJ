package LeetCode.SpiralMatrix;

import java.util.ArrayList;

public class Recursive_02_Solution {
    public static void main(String[] args){
        // Define input matrix
        int[][] matrix = {
                { 1,  2,  3 },
                { 4,  5,  6 },
                { 7,  8,  9 },
                {10, 11, 12}
        };
        ArrayList<Integer> output = Solution.spiralOrder(matrix);
        System.out.println(output);
    }
    public static class Solution{
        public static ArrayList<Integer> spiralOrder(int[][] matrix){
            if(matrix==null || matrix.length==0) return new ArrayList<>();
            // x,y = [0][0] start point of recursive call
            // m - nr rows = matrix.length
            // n - nr columns = matrix[0].length
            return spiralOrder(matrix,0,0,matrix.length,matrix[0].length);
        }
        public static ArrayList<Integer> spiralOrder(int[][] matrix, int x, int y, int m, int n){
            ArrayList<Integer> result = new ArrayList<>();
            // Base case: if no rows or columns left, return empty list (end recursion).
            if(m<=0||n<=0) return result;
            // Special case: if only one element remains, add it and return.
            if(m==1&&n==1){
                result.add(matrix[x][y]);
                return result;
            }

            // top row - move right
            for(int i=0; i<n-1; i++){
                result.add(matrix[x][y++]);
            }
            // right column - move down
            for(int i=0; i<m-1; i++){
                result.add(matrix[x++][y]);
            }
            // bottom row - move left (if more than 1 rows left)
            if(m>1){
                for(int i=0; i<n-1; i++){
                result.add(matrix[x][y--]);
                }
            }
            // left column - move up (if more than 1 columns left)
            if(n>1){
                for(int i=0; i<m-1; i++){
                result.add(matrix[x--][y]);
                }
            }
            if(m==1||n==1){ // 1 row or 1 column, make a recursive call with a 1×1 submatrix.
                result.addAll(spiralOrder(matrix,x,y,1,1));
            }
            else{ // Move starting point inwards: x + 1, y + 1
                  // Shrink size: m - 2, n - 2 (exclude outer layer)
                result.addAll(spiralOrder(matrix,x+1,y+1,m-2,n-2));
            }
            return result;
        }
    }
}
