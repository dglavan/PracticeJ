import java.util.Random;

public class RandomGenerate {
    public static void main(String[] args){
        int c;
        Random t = new Random();

        for(c=0;c<=10;c++){
            System.out.print(t.nextInt(100) + " "); // to print in same line use 'print'
                                                            // instead of 'println'
        }
        System.out.println();
    }
}
