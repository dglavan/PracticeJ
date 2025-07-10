package aaProblems;


import java.util.HashSet;
import java.util.Set;

public class ReWrite_test {
    public static void  main(String[] args) {
        String input = "Sdjakkrtyuiopasddk";
        String result = findLongestUniqueSubstring(input);
        System.out.println("Longest unique-char substring is: " + result + " and has size of "+ result.length());
    }

    public static String findLongestUniqueSubstring(String s){
        int longest = 0;
        int start = 0,  left = 0, right = 0;

        Set<Character> unique = new HashSet<>();

        while(right<s.length()){

            if(!unique.contains(s.charAt(right))){ // new char
                unique.add(s.charAt(right)); // add new char to set
                right++; // expand window to right

                if(right-left>longest){ // when window width > previous (longest) -> update longest + move start to left
                    longest=right-left;
                    start = left;
                }
            }
            // if char duplicate -> remove all left until first duplicate is removed from set (from left side)
            else{
                unique.remove(s.charAt(left));
                left++;
            }


        }

        return s.substring(start, start+longest );
    }
}
