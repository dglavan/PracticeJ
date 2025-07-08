import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllSubstringOfString {
    public static void main(String[] args){
        String string, sub;
        int i, c, length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to find substrings: ");
        string = scanner.nextLine();

        length = string.length();

        System.out.println("Substrings of String " +string +" are: ");
        for(c=0;c<length;c++){
            for(i=1;i<=length-c;i++){
                sub = string.substring(c,c+i);
                System.out.println(sub);
            }
        }
    }
}
