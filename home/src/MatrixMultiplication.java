import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args){
        int m, n, p, q, c, d, k, sum=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter nr of rows and colums - first matrix:");
        m = scanner.nextInt();
        n = scanner.nextInt();

        int[][] first = new int[m][n];

        System.out.println("Enter elems for first matrix:");

        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                first[c][d] = scanner.nextInt();
            }
        }

        System.out.println("Enter nr of rows and colums - second matrix: ");
        p = scanner.nextInt();
        q = scanner.nextInt();

        if(n!=p){
            System.out.println("Matrices with entered orders cannot be multiplied!");
        }
        else{
            int[][] second = new int[p][q];
            int[][] multiplied = new int[m][q];

            System.out.println("Enter elements for second matrix:");

            for(c=0;c<p;c++){
                for(d=0;d<q;d++){
                    second[c][d] = scanner.nextInt();
                }
            }

            for(c=0;c<m;c++){
                for(d=0;d<q;d++){
                    for(k=0;k<p;k++){
                        sum = sum + first[c][k] + second[k][d];
                    }
                    multiplied[c][d] = sum;
                    sum = 0;
                }
            }

            System.out.println("Product of entered matrices:");

            for(c=0;c<m;c++){
                for(d=0;d<q;d++){
                    System.out.println(multiplied[c][d]+ "\t");
                    System.out.println("\n");
                }
            }
        }
    }
}
