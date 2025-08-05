package LeetCode.ValidPalindrome;

import java.util.Stack;

public class UsingStack_02_Solution {
    public static void main(String[] args) {
        String input = "Red rum, sir, is murder";
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String s) {
        // remove special characters & convert all to lowercase:
        // "Red rum, sir, is murder" ➝ "redrumsirismurder"
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int len = s.length();
        // special case for 0 or 1 chars => is Palindrome default
        if (len < 2) return true;
        // declare stack and index tracker
        Stack<Character> stack = new Stack<>();
        int index = 0;
        // push First Half of chars to stack
        while (index < len / 2) {
            stack.push(s.charAt(index));
            index++;
        }
        // Skip Middle Character (for Odd Lengths)
        if (len % 2 == 1) {
            index++; // index is at mid-point now
        }
        // Iterates through the Second Half of the string. 
        while (index < len) {
            // if empty too early => mismatch
            if (stack.isEmpty())
                return false;

            char temp = stack.pop();
            // mismatch
            if (s.charAt(index) != temp) {
                return false; // stop
            } else { // match
                index++; // continue
            }

        }
        return true;
    }
}
