package LeetCode.ValidParentheses;
// Given a string containing just the characters ’(’, ’)’, ’’, ’’, ’[’ and ’]’, determine if the input string is valid.
//  The brackets must close in the correct order, "()" and "()[]" are all valid but "(]" and "([)]" are not.

import java.util.HashMap;
import java.util.Stack;

public class Native_01_Solution {
    public static void main(String[] args){
        String input = "{[()]}";
        System.out.println(isValid(input));
    }
    public static boolean isValid(String s){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> stack = new Stack<>();
        // iterate through each character in string
        for(int i=0; i < s.length(); i++){
            char curr = s.charAt(i);

            if(map.keySet().contains(curr)){
                stack.push(curr); // If current character is '(', '{', or '[', push it to the stack.
            } else if (map.values().contains(curr)){ // Check if it’s one of ')', ']', or '}'.
                // Match: check stack not empty and top element is matches closing bracket
                if(!stack.isEmpty() && map.get(stack.peek()) == curr){ // e.g. map.get('(') returns ')'.
                    stack.pop();
                } else { // Mismatch
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
