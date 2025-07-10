package LeetCode.ReversePolishNotation;

//We can loop through each element in the given array.
//1. When it is a number, push it to the stack.
//2. When it is an operator, pop two numbers from the stack, do the calculation, and push back the result.
// Input : ["2", "1", "+", "3", "*"] -> Output : ((2 + 1) * 3) -> 9
// Input : ["4", "13", "5", "/", "+"] ->  Output : (4 + (13 / 5)) -> 6

import java.io.IOException;
import java.util.Stack;

public class Native_01_Solution {
    public static void main(String[] args) throws IOException {
        String[] tokens = new String[] {"4","13",";","a","5","/","+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens){
        int returnValue = 0;
        String operators = "+-*/";

        // Declaration of stack
        Stack<String> stack = new Stack<>();

        for(String t : tokens){ // loop through elements in Input String array
            if(!operators.contains(t)){ // check if operator

                // Ignore junk tokens like ";" or "a"
                if(!isNumber(t)) continue; // if not a number -> skip to next token

                stack.push(t); //1. When it is a number, push it to the stack.
            }
            else { // When we find and operator

                // Protection if stack doesn't have 2 elements to pop
                if(stack.size()<2) continue; // skip operation token if stack doesn't have min. 2 elements

                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                switch (t){
                    case "+": stack.push(String.valueOf(a+b)); break;
                    case "-": stack.push(String.valueOf(b-a)); break;
                    case "*": stack.push(String.valueOf(a*b)); break;
                    case "/":
                        try {
                            stack.push(String.valueOf(b/a)); break;
                        } catch (ArithmeticException e) {
                            System.out.println("Cannot divide by zero: " + e.getMessage());
                        }

                }
            }
        }
        returnValue = Integer.valueOf(stack.pop()); //returns final calculation result previously pushed to top of stack
        return returnValue;
    }

    // Helper methode to check if element of string array is number before push to stack
    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str); // Accepts int and floating-point numbers
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
