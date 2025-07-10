package aaProblems;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static String findLongestUniqueSubstring(String s){
        int n = s.length();
        int left = 0, right = 0;
        int maxLength = 0;
        int start = 0;

        HashSet<Character> set = new HashSet<>();

        while(right<n){
            char current = s.charAt(right);
            //  check current -> add to set -> move to next
            if(!set.contains(current)){
                set.add(current); //adds new value to set
                right++; // window grows to right (previous maxLength will fall behind )

            // update maxLength -> adjust start index if needed
                if(right - left > maxLength){ // window length > prev maxLength
                    maxLength = right - left; // inc maxLength => unique substring grows
                    start = left; // move start index to beginning of new max unique substring
                }
            }
            else {
            // remove left-most char until duplicate is gone
                set.remove(s.charAt(left));
                left++;
            }
        }
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args){
        String input = "Sdjakkrtyuiopasddk";
        String result = findLongestUniqueSubstring(input);
        System.out.println("Longest unique-char substring is: " + result + " and has size of "+ result.length());
    }
}
