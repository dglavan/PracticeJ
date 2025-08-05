package LeetCode.NeedleInHaystack;

public class StartIndex_Solution {
    public static void main(String[] args){
        String haystack = "abDabcX";
        String needle = "abc";
        int startIndex = strStr(haystack,needle);
        if(startIndex >= 0){
            System.out.println("Needle found and starts at index: " + startIndex);
        } else {
            System.out.println("Needle not found in haystack!");
        }
    }
    public static int strStr(String haystack, String needle){
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        if(needleLen==0) return 0; // empty needle
        if(needleLen > haystackLen) return -1; // needle longer than haystack => no match -> return -1
        // valid case search
        for(int i=0; i<= haystackLen - needleLen; i++){
            int j = 0; // needle start index
            while (j < needleLen && haystack.charAt(i+j) == needle.charAt(j)){ // checks needle validity
                j++; // tracks needle index from start to end of length incrementing char by char
            }
            if(j==needleLen){ // found full match -> return start index of needle i
                return i;
            }
        }
        return -1; // no match
    }
}
