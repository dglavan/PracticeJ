import java.util.ArrayList;
import java.util.List;

public class PrimeList {
    public static void  main(String[] args){
        List primeList = new ArrayList<>();
        int upUntil = 100;
        for(int i=2; i<=upUntil; i++){
            if(isPrime(i)){
                primeList.add(i);
            }
        }
        System.out.println(primeList);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
