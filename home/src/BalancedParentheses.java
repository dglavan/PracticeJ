import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            // Push opening brackets
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            // Handle closing brackets - conditions : stack is not empty + pop & match
            else if (ch == ')' || ch == ']' || ch == '}') {
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if(!matches(top,ch)) {
                    return false;
                }
            }
        }
        // Stack should be empty at the end if all matched ! otherwise open remains unclosed
        return stack.isEmpty();
    }

        // Helper method to check matching pairs
    private static boolean matches(char open, char close){
        return ( open == '(' && close == ')') ||
                ( open == '[' && close == ']') ||
                ( open == '{' && close == '}');
    }

    public static void main(String[] args){
        String input = "{[(.2e)dsad]()}";
        System.out.println("Is balanced? : " + isBalanced(input));
    }
}

                          // Python Version
//def is_balanced(s):
//stack = []
//
//        for ch in s:
//        # Push opening brackets
//        if ch in '([{':
//        stack.append(ch)
//
//        # Handle closing brackets - if we encounter closing and list is empty -> no match with open
//        elif ch in ')]}':
//        if not stack:
//        return False
//
//        top = stack.pop()
//        if not matches(top, ch):
//        return False
//
//    # Final check: all opened must be closed
//    return not stack
//
//def matches(opening, closing):
//        return (opening == '(' and closing == ')') or \
//        (opening == '[' and closing == ']') or \
//        (opening == '{' and closing == '}')
//
//        # Test example
//input_str = "{[(.2e)dsad]()}"
//
//print("Is balanced?:", is_balanced(input_str))