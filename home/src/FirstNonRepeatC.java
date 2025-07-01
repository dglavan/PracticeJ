import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatC {
    public static void main(String[] args){

        String str="sswwiss";
        Map<Character,Integer> charCount = new HashMap<>();

        // iterate char in input string and count repetition of chars
        for(char c : str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }

        System.out.println(charCount.entrySet()); // displays pairs of <char,count>

        // iterate <char,count> entry pairs one by one and
        // return the first key when count is 1 (first Non-repeat char)
        for(Map.Entry<Character,Integer> entry: charCount.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }else{
                System.out.println("No char in string that doesn't repeat!");break;
            }
        }
    }
}
