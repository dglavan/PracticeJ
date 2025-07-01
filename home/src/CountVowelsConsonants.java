import java.sql.SQLOutput;
import java.util.Set;

public class CountVowelsConsonants {
    public static void main(String[] args){

        // #1 BASIC COUNTER

//        String str = "Automation";
//        int vowels = 0, consonants = 0;
//        for(char c:str.toCharArray()){
//            if("aeiouAEIOU".indexOf(c) != -1){
//                vowels++;
//            }
//            else if (Character.isLetter(c)) {
//                consonants++;
//            }
//        }
//        System.out.println("Vowels: " +vowels +"\nConsonants: " +consonants);

        // #2 USING SETS (more efficient look-ups)

//        String str = "Automation";
//        int vowels = 0, consonants = 0;
//
//        Set<Character> vowelSet = Set.of('a','e','i','o','u','A','E','I','O','U');
//        for(char c: str.toCharArray()){
//            if(Character.isLetter(c)){
//                if(vowelSet.contains(c)){
//                    vowels++;
//                } else {
//                    consonants++;
//                }
//            }
//        }
//        System.out.println("Vowels: " + vowels + "\nConsonants: " + consonants);

        // #3 USING REGULAR EXPRESSIONS (shorter, compact logic)

//        String str = "Automation";
//        str = str.replaceAll("[^a-zA-Z]", ""); // remove all non-letters chars
//
//        int vowels = str.replaceAll("[^aeiouAEIOU]", "").length(); //remove all non-vowels and get length
//        int consonants = str.length() - vowels;
//
//        System.out.println("Vowels: " + vowels + "\nConsonants: " + consonants);

        // #4 USING STREAMS (functional style)

          String str = "Automation";

          long vowels = str.chars()
                  .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                  .count();

          long consonants = str.chars()
                  .filter(c -> "aeiouAEIOU".indexOf(c) == -1)
                  .count();

          System.out.println("Vowels: " + vowels + "\nConsonants: " + consonants);

    }
}
