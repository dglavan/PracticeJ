package LeetCode.NeedleInHaystack;

public class Simplified_02_Solution {
    public static void main(String[] args){
        String haystack = "abDabcX";
        String needle = "abc";
        String result = strStr(haystack,needle);
        System.out.println(result);
    }
    public static String strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        if (needleLen == 0) return haystack;
        if (needleLen > haystackLen) return null;

        for (int i = 0; i <= haystackLen - needleLen; i++) {
            int j = 0;

            while (j < needleLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needleLen) {
                return haystack.substring(i);
            }
        }
        return null;
    }
}
