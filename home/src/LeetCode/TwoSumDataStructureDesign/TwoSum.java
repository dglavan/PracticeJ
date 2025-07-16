package LeetCode.TwoSumDataStructureDesign;

import java.util.HashMap;

public class TwoSum {
    private static HashMap<Integer,Integer> elements = new HashMap<>();

    //Method adds a <number , count> to map
    public static void add(int number){
        if (elements.containsKey(number)){ // if it's already added in map , increment count +1
            elements.put(number, elements.get(number)+1);
        } else {
            elements.put(number,1); // if it's not in map, add it to map and set count to 1
        }
    }

    public static boolean find(int targetSum){ // find a possible sum : target = nr + complement
        for(Integer i : elements.keySet()){
            int complement = targetSum - i; // define (complement) <- key value needed to be found in map for success
            if(elements.containsKey(complement)){
                if(i==complement & elements.get(complement)<2) continue; //check for nr = complement must have count 2 or skip
                return true;                                             //e.g. looking for target sum = 4 as 2+2
            }
        }
        return false;
    }
}
