public class FactorialNum {
    public static void main(String[] args){
        int num=4, factorial = 1;
        for(int i=1; i <= num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
