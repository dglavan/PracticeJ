package LeetCode.Rotate2DMatrix;
// top-left : (i,j) -> initial [0][0] => Inner Loop j++ moving towards right (first increment column)
// bottom-left : (n-1-j, i) -> initial [2][0] => Inner j++ moving towards top (first decrement row)
// bottom-right : (n-1-i, n-1-j) -> initial[2][2] => Inner j++ moving towards left (first decrement column)
// top-right : (j, n-1-i) -> initial[0][2] => Inner j++ moving towards bottom (first increment row)
public class InPlace4WaySwap_02_Solution {
    public static void main(String[] args){
        int[][] input = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Solution_01_PassByValue.Solution.rotate(input);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println(); // only after finishing a row
        }
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
                int temp = matrix[i][j]; // memorize top-left
                matrix[i][j] = matrix[n-1-j][i]; // top left <- bottom-left
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j]; // bottom-left <- bottom-right
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i]; // bottom-right <- top-right
                matrix[j][n-1-i] = temp; // top-right <- memorized top-left
            }
        }
    }
}
