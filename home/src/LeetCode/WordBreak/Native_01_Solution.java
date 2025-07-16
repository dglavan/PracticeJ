package LeetCode.WordBreak;

// Problem : Given a string s and a dictionary of words dict, determine if s can be segmented into
// space-separated sequence of one or more dictionary words. For example, given s ="leetcode",
// dict = ["leet", "code"]. Return true because "leetcode" can be segmented as "leet code".

// Complexity : Time: O(nˆ2)

import java.util.HashSet;
import java.util.Set;

public class Native_01_Solution {
    public static void main(String[] args){
        String example = "leetcode";
        Set<String> dictionary = new HashSet<>();
        dictionary.add("leet");
        dictionary.add("code");
        System.out.println(wordBreak(example,dictionary));
    }
    // Wrapper function that starts recursion from index 0
    public static boolean wordBreak(String s, Set<String> dict){
        return wordBreakHelper(s, dict, 0);
    }

    public static boolean wordBreakHelper(String s, Set<String> dict, int start){
        if(start == s.length()) return true; // base case -> entire string has been matched with dict words
        // Iterates over each word in the dictionary.
        for(String a:dict){
            int len = a.length(); // length of each word from dict
            int end = start + len; // end index of each word from dict

            if(end>s.length()) continue; // end index should be <= string length

            if(s.substring(start,end).equals(a)){ // check if substring from start to end (first word) matches
                // if match recursively calls function with new start=end
                if(wordBreakHelper(s, dict, end)) return true; // recursive call to match word after word in dict
            }
        }
        return false;
    }
}
