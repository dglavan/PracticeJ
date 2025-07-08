import java.util.Scanner;

public class AddTwoMatrixes {
    public static void main(String[] args){
        int m, n, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        m = scanner.nextInt();
        n = scanner.nextInt();

        int[][] first = new int[m][n];
        int[][] second = new int[m][n];
        int[][] sum = new int[m][n];

        System.out.println("Enter elements for first matrix:");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                first[c][d] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for second matrix:");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                second[c][d] = scanner.nextInt();
            }
        }

        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                sum[c][d] = first[c][d] + second[c][d]; // replace '+' with '-' for substraction
            }
        }

        System.out.println("Sum of the two matrixes: ");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                System.out.println(sum[c][d] + "\t");
                System.out.println();
            }
        }
    }
}
