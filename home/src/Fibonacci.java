import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args){
        int n = 10,
                num1 = 0, num2 =1;
        List<String> fibonnaci = new ArrayList<>(); //type not necessary
        fibonnaci.add(Integer.toString(num1)); // used String type for practice of conversion
        fibonnaci.add(Integer.toString(num2));
        for (int i=2; i<n; i++) {
            int num3 = num1 + num2;
            fibonnaci.add(String.valueOf(num3)); // another way to convert int to String
            num1 = num2;
            num2 = num3;
        }
        System.out.println(fibonnaci);
    }
}
