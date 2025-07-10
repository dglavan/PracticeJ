package LeetCode.LongestPalindromeSubstring;

// Finding the longest palindromic substring
// The time complexity is O(nˆ3).

public class Native_01_Solution {
    public static void main(String[] args){
        String example = "abas";
        System.out.println(longestPalindrome(example));
    }

    public static String longestPalindrome(String s){
        int maxLength = 0;
        String longest = null;
        int length = s.length();

        // Check all possible sub-strings
        for(int i=0; i<length;i++){ // Outer loop sets starting index for possible substring
            for(int j=i+1; j<length; j++){ // Inner loop moves towards end of string and checks each substring
                int len = j-i;
                String current = s.substring(i, j+1); // +1 because right end side of interval is exclusive

                // For any found palindrome if longest so far -> memorize it and update maxLength accordingly
                if(isPalindrome(current)){
                    if(len > maxLength){
                        longest = current;
                        maxLength = len;
                    }
                }
            }
        }
        return longest;
    }
    // Helper methode to check if string is Palindrome
    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()-1;i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}
