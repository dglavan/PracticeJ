package LeetCode.NeedleInHaystack;
// Implement strStr(). Returns a pointer to the first occurrence of needle in haystack,
// or null if needle is not part of haystack.
// First, need to understand the problem correctly, the pointer simply means a sub string.

public class Native_01_Solution {
    public static void main(String[] args){
        String haystack = "abDabcX";
        String needle = "abc";
        String result = strStr(haystack,needle);
        System.out.println(result);
    }
    public static String strStr(String haystack, String needle){
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        // Edge case: if both are empty strings, return "".
        if(needleLen == haystackLen && needleLen == 0){
            return "";
        }
        // If the needle is empty but haystack is not, by convention, return the full haystack.
        if(needleLen==0){
            return haystack;
        }
        // Iterate through each character in haystack, looking for a possible starting match.
        for(int i=0; i< haystackLen; i++){
            // make sure in boundary of needle
            if(haystackLen - i  < needleLen){
                return null;
            }

            int k = i; // k tracks the current index in haystack
            int j = 0; // j tracks the current index in needle.

            while (j < needleLen && k < haystackLen && needle.charAt(j) == haystack.charAt(k)){
                j++;
                k++;
                if(j == needleLen){ // found a full match — return the substring starting at index i.
                    return haystack.substring(i);
                }
            }
        }
        return null; // If the entire loop completes without a match, return null.
    }
}
