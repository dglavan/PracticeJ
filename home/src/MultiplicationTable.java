import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        int a,b,c,d;
        System.out.println("Enter a range [min,max] to calculate multiplication table :");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        for(c=a;c<=b;c++){
            System.out.println("Multiplication tabel for: "+ c);
            for(d=1;d<=10;d++){
                System.out.println(c + "*" + d + "=" + (c*d));
            }
        }
    }
}
