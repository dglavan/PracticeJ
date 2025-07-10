package LeetCode.LongestPalindromeSubstring;

// Finding the longest palindromic substring
// Complexity : Time O(nˆ2), Space O(1)
public class Simple_03_Solution_Best {
    public static void main(String[] args){
        String example = "xabxbaxz";
        System.out.println(longestPalindrome(example));
    }
    public static String longestPalindrome(String s){
        // special case if input string null
        if(s.isEmpty()) return null;
        // special case if input string has only 1 character
        if(s.length()==1) return s;

        String longest = s.substring(0,1); // Initialize the shortest string (single-char)

        for(int i=0; i<s.length(); i++){

            // get the longest palindrome with center i (odd nr. of chars)
            String tmp = expandCenter(s,i,i);
            if(tmp.length() > longest.length()) longest=tmp;

            // get the longest palindrome with double center i, i+1 ( even nr. of chars)
            tmp = expandCenter(s,i,i+1);
            if(tmp.length() > longest.length()) longest=tmp;
        }

        return longest;
    }

    // Helper method to expand from center to margins and check mirroring of chars
    public static String expandCenter(String s, int begin, int end){
        while (begin >= 0 && end <= s.length()-1 && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
        }
        return s.substring(begin+1,end);
    }
}
