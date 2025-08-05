package LeetCode.Rotate2DMatrix;
// 90°Rotation Right = Transpose + Reverse each row
// 90°Rotation Left = Transpose + Reverse each column
// 180° Both = Reverse both rows and columns
// Rotation	        Step 1	        Step 2
// 90° Right (CW)	Transpose	Mirror OY (reverse each row)
// 90° Left (CCW)	Transpose	Mirror OX (reverse row order)
// 180°	            Mirror OY	Mirror OX
public class RotationLogic_Transposed {
    public static void main(String[] args){
        int[][] input = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate180(input);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println(); // only after finishing a row
        }
    }
    public static void rotateR(int[][] matrix){
        int n = matrix.length;

        // Transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each Row - where n nr of Rows
        for (int i = 0; i < n; i++) {         // for each logic -> (int[] row : matrix)
            int left = 0, right = n - 1;      // left = 0 , right = matrix.length -1
            while (left < right) {
                int temp = matrix[i][left];         // int tmp = matrix[left]
                matrix[i][left] = matrix[i][right]; // matrix[left] = matrix[right]
                matrix[i][right] = temp;            // matrix[right] = matrix[left]
                left++;
                right--;
            }
        }
    }
    public static void rotateL(int[][] matrix){
        int n = matrix.length;

        // Transpose matrix
        for(int i = 0; i < n; i++){
            for(int j=i+1; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        // Reverse each Column
        for(int i=0; i<n; i++){
            int top = 0, bottom = n-1;
            while (top < bottom){
                int tmp = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = tmp;
                top++;
                bottom--;
            }
        }
    }
    public static void rotate180(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Reverse each row
        for (int[] row : matrix) {
            reverseArray(row);
        }

        // Step 2: Reverse the order of the rows => (Reversed columns - value-wise)
        for (int i = 0; i < n / 2; i++) { // only until mid-row
            int[] temp = matrix[i]; // memorize first row
            matrix[i] = matrix[n - 1 - i]; // first row <- last row
            matrix[n - 1 - i] = temp; // last row <- first memorized row
        }
    }
    // helper method to revers elements from a Row : first with last and so on towards mid
    private static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
}
