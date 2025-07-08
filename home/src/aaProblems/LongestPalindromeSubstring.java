package aaProblems;

public class LongestPalindromeSubstring {
    public static String longestPalindrome(String s){
        if (s == null || s.length() < 1) return "";

        int start = 0 , end = 0;

        for(int i=0; i < s.length(); i++){

            // Try odd-length palindrome centered at i (single center - 'abAba')
            int len1 = expandFromCenter(s, i, i);

            // Try even-length palindrome centered at i and i+1 (double char center - 'aBBa')
            int len2 = expandFromCenter(s, i, i+1);

            int len = Math.max(len1,len2);

            if(len > end - start){
                // Update start and end based on new max Length
                start = i - (len -1) / 2; // handles both even and odd cases
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }

    // Helper methode to Expand window left-right around center of valid Palindrome
    private static int expandFromCenter(String s, int left, int right){
        while(left >=0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1; // actual palindrome Length
    }

    public static void main(String[] args){
        String s = "abbabbas";
        System.out.println("Longest Palindrome substring is: " + longestPalindrome(s) + " -> length: " + longestPalindrome(s).length());
    }
}
