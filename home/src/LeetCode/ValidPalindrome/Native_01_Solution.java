package LeetCode.ValidPalindrome;
// "Red rum, sir, is murder" is a palindrome
// From start and end loop though the string, i.e., char array. If it is not alpha or number
// increase or decrease pointers. Compare the alpha and numeric characters.
public class Native_01_Solution {
    public static void main(String[] args){
        String input = "Red rum, sir, is murder";
        System.out.println(Solution.isPalindrome(input));
    }
    public static class Solution{
        public static boolean isPalindrome(String s){
            // special cases
            if(s==null) return false;
            if(s.length() < 2) return true;
            // declare charArray from string
            char[] charArray = s.toCharArray();
            int len = s.length();

            int i = 0; // pointer from start
            int j = len - 1; // pointer from end

            while (i<j){ // use pointers to iterate through charArray from both ends
                char left, right;
                left = charArray[i];
                right = charArray[j];
                // skip non-alphanumeric -> move i pointer 1by1 ignoring non-valid chars
                while (i < len-1 && !isAlpha(left) && !isNum(left) ){
                    i++;
                    left = charArray[i];
                }
                // skip non-alphanumeric -> move j pointer 1by1 ignoring non-valid chars
                while (j > 0 && !isAlpha(right) && !isNum(right) ){
                    j--;
                    right = charArray[j];
                }
                // if pointers cross stop -> we have compared all chars
                if(i >= j) break;
                // if mismatch -> return false
                if(!isSame(left,right)){
                    return false;
                }
                // move pointers inwards to continue comparison
                i++;
                j--;
            }
            return true;
        }
        // helper method to check alpha characters
        public static boolean isAlpha(char a){
            if((a >= 'a' && a <= 'z') || (a >='A' && a <='Z')){
                return true;
            }
            else{
                return false;
            }
        }
        // helper method to check numeric characters
        public static boolean isNum(char a){
            if(a >= '0' && a <= '9'){
                return true;
            }
            else return false;
        }
        // helper method to check Palindrome
        public static boolean isSame(char a, char b){
            if(isNum(a) && isNum(b)){
                return a == b;
            } else if (Character.toLowerCase(a) == Character.toLowerCase(b)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
