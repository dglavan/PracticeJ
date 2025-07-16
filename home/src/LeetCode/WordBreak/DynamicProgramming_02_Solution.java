package LeetCode.WordBreak;
// Complexity : Time: O(str.length * dict size)
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DynamicProgramming_02_Solution {
    public static void main(String[] args){
        String example = "catscatanddogsand";
        Set<String> dictionary = new HashSet<>();
        dictionary.add("cats");
        dictionary.add("dog");
        dictionary.add("sand");
        dictionary.add("and");
        dictionary.add("cat");

        System.out.println(wordBreak(example,dictionary));
    }

    public static boolean wordBreak(String s, Set<String> dict){
        // A cache that maps index → true/false for whether s[index:] can be broken
        Map<Integer, Boolean> memo = new HashMap<>();
        return wordBreakHelper(s,dict,0,memo);
    }

    private static boolean wordBreakHelper(String s, Set<String> dict, int start, Map<Integer,Boolean> memo){
        if(start==s.length()) return true;

        // If result already computed for this index, return it
        if(memo.containsKey(start)) return memo.get(start);

        for(String word:dict){
            int len = word.length();
            int end = start + len;

            if(end > s.length()) continue;

            if(s.substring(start,end).equals(word)){
                if(wordBreakHelper(s,dict,end,memo)){
                    memo.put(start,true); // memorize index of valid word
                    return true;
                }
            }
        }
        memo.put(start,false); // memorize failure
        return false;
    }
}
