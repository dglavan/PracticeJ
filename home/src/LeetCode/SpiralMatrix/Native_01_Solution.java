package LeetCode.SpiralMatrix;


import java.util.*;

// Given a matrix of m x n elements (m rows, n columns), return all elements of the
// matrix in spiral order. Example :
// [
//  [ 1, 2, 3 ],
//  [ 4, 5, 6 ],
//  [ 7, 8, 9 ]
// ]
// should return [1,2,3,6,9,8,7,4,5].
public class Native_01_Solution {
    public static void main(String[] args){
        // Define input matrix
        int[][] matrix =
                {
                {1,2,3},
                {4,5,6},
                {7,8,9}
                };
        ArrayList<Integer> output = Solution.spiralOrder(matrix);
        System.out.println(output);

    }
    public static class Solution{
        public static ArrayList<Integer> spiralOrder(int[][] matrix){
            ArrayList<Integer> result = new ArrayList<Integer>();
            // special case input null
            if(matrix == null || matrix.length == 0) return result;

            int m = matrix.length; // length of matrix (nr. of elem.) => number or rows
            int n = matrix[0].length; // length of first elem. (row) => number of columns

            int x = 0, y = 0; // starting point [0][0]

            while (m>0 && n>0){
                // if one row/column left => no circle to form
                if(m==1){
                    for(int i=0; i<n; i++){
                        result.add(matrix[x][y++]);
                    }
                    break;
                } else if (n == 1) {
                    for(int i=0; i<m; i++){
                        result.add(matrix[x++][y]);
                    }
                    break;
                }
                // process circle

                // top row -> move right
                for(int i=0; i<n-1; i++){
                    result.add(matrix[x][y++]);
                }
                // right column -> move down
                for(int i=0; i<m-1; i++){
                    result.add(matrix[x++][y]);
                }
                // bottom row -> move left
                for(int i=n-1; i>0; i--){ // equiv. for(int i=0; i < n-1; i++)
                    result.add(matrix[x][y--]);
                }
                // left column -> move up
                for(int i=m-1; i>0; i--){ // equiv. for(int i=0; i < m-1; i++)
                    result.add(matrix[x--][y]);
                }
                // move inwards -> next layer => start becomes [1][1]
                x++;
                y++;
                // remove top row, right column, bottom row, left column (prev. layer)
                m -= 2;
                n -= 2;
            }
            return result;
        }
    }
}
