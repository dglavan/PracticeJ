public class CheckPalindrome {
    public static void main(String[] args){
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println("This is a palindrome!");
        }
        else{
            System.out.println("It's not a palindrome!");
        }
    }
}
