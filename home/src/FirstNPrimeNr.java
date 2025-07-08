import java.util.Scanner;

public class FirstNPrimeNr {
    public static void main(String[] args){
        int n, status = 1, num = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of first prime numbers to be displayed: ");
        n = scanner.nextInt();

        if(n>=1){
            System.out.println("The first " +n +" prime numbers are: ");
            System.out.println(2);
        }
        for( int count = 2; count <=n;){
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    status = 0;
                    break;
                }
            }
            if(status!=0){
                System.out.println(num);
                count++;
            }
            status =1;
            num++;
        }
    }
}
