package LeetCode.ValidParentheses;

import java.util.HashMap;
import java.util.Stack;
// map.containsKey()               VS map.keySet().containsKey()
// Direct API method for key check VS Indirect and slower
// map.containsKey()  Directly implemented and optimized by the Map interface. Time Complexity: Usually O(1) for HashMap.
// map.keySet().containsKey() Internally creates a view of the keys (Set<K>) and checks membership there.
// Less efficient, especially for large maps. Not the idiomatic way to check for keys in a map.
public class Simplified_02_Solution {
    public static void main(String[] args){
        String s = "{[()]}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        // first convert String to CharArray
        char[] charArray = s.toCharArray();

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> stack = new Stack<>();

        for(Character c: charArray){
            if(map.containsKey(c)){
                stack.push(c);
            } else if (map.containsValue(c)) {
                if(!stack.isEmpty() && map.get(stack.peek()) == c){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
