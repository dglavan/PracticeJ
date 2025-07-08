import java.util.Scanner;

public class Palindrome2ndMethod {
    public static void main(String[] args){
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to check if Palindrome: ");
        str = scanner.nextLine();

        int length = str.length();
        int i, beggin,middle,end;
        beggin = 0;
        end = length -1;
        middle = (beggin + end)/2;

        for(i=0;i<= middle;i++){
            if(str.charAt(beggin) == str.charAt(end)){
                beggin++;
                end--;
            }
            else{
                break;
            }
        }
        // after i = middle (last verification) - correct - i++ increments again
        // correct final check condition has to also match i = middle + 1
        if(i == middle+1){
            System.out.println("It's a Palindrome");
        }
        else {
            System.out.println("It's not a Palindrome");
        }
    }
}
