package LeetCode.ValidPalindrome;
// 1. Clean-up String for comparison
// 2. Move with two pointers referencing i to compare chars in string
// Left pointer from i=0 moving right when i++
// Right pointer from s.length()-1 -i moving left when i++
public class Simple_03_TwoPointers_Solution {
    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s){
        if(s==null || s.isEmpty()) return false;
        // remove special characters & convert all to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i=0; i<s.length()/2; i++){ // interate char by char from both sides of string
            if(s.charAt(i) != s.charAt(s.length()-1-i)) // mismatch
                return false; // stop
        }
        return true;
    }
}
