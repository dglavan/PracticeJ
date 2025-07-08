import java.util.Scanner;

public class TransposedMatrix {
    public static void main(String[] args){
        int m, n, c, d;

        // Step.1 - Define size of matrix
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nr of rows and colums for matrix:");
        m = scanner.nextInt();
        n = scanner.nextInt();

        int[][] matrix = new int[m][n]; // create matrix of input size (m x n)

        // Step.2 - Initialize matrix with input elements
        System.out.println("Enter elements for matrix:|");
        for(c=0;c<m;c++){ // outer loop iterates rows: after row 1 finished move to row 2
            for(d=0;d<n;d++){ // inner loop iterates columns and writes 1st row, then 2nd , etc.
                matrix[c][d] = scanner.nextInt();
                // write value from input
                // m[0][0],
                // m[0][1]
                // .
                // m[1][0]
            }
        }

        // Declaration of transposed matrix
        int[][] transposed = new int[n][m];
        // Step.3 - Initialize transposed with values from matrix -> rule: [n][m] = [m][n]
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                transposed[d][c] = matrix[c][d];
            }
        }

        // Step.4 - Printing matrix and it's transposed
        // same method as initializing using outer + inner loop - used for printing
        System.out.println("matrix: ");
        for(c = 0; c < m; c++) {
            for(d = 0; d < n; d++) {
                System.out.print(matrix[c][d] + "\t"); // print in same line
            }
            System.out.println(); // new line after each row
        }

        System.out.println("Transposed of matrix: ");
        for(c = 0; c < n; c++) { // n rows in transposed
            for(d = 0; d < m; d++) { // m columns in transposed
                System.out.print(transposed[c][d] + "\t"); // print in same line
            }
            System.out.println(); // new line after each row
        }
    }
}
