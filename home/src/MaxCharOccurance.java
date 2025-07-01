import java.util.HashMap;

public class MaxCharOccurance {
    public static void main(String[] args){
        String str = "programmingg";
        HashMap<Character,Integer> charCount = new HashMap<>();

        // iterate str chars and count frequency
        for(char c: str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }

        char maxChar = str.charAt(0); // initial most frequent char
        int maxCount = 0;

        // iterate keys and for each one get Count value and modify maxCount accordingly
        for (char c: charCount.keySet()){
            if(charCount.get(c) > maxCount){
                maxCount = charCount.get(c);
                maxChar = c;
            }
        }
        System.out.println("Character "+ maxChar +" has most occurances: " +maxCount);
    }
}
