package LeetCode.TwoSum;
// Use HashMap to store the target value.
// Time complexity depends on the put and get operations of HashMap which is normally O(1).
// Time complexity of this solution: O(n).

import java.util.Arrays;
import java.util.HashMap;

public class Better_02_Solution {
    public static void main(String[] args){
        int[] input = {11,15,3,5,8,6};
        int target = 9;
        int[] res = twoSum(input,target);

        System.out.println("Elements: [" + input[res[0]] + ", " + input[res[1]] +"] found at indexes: " + Arrays.toString(res));
    }

    public static int[] twoSum(int[] numbers, int target){
        HashMap<Integer, Integer> map = new HashMap<>(); // declare HashMap to store complements + indexes of each elem
        int[] result = new int[2]; // declare int pair considered result - first pair found (their sum = target)

        for(int i=0; i < numbers.length; i++){ // iterate through list of int element by element
            if(map.containsKey(numbers[i])){ // success case - current number matched to a complement prev memorized in map
                int index = map.get(numbers[i]); // get index of existing complement (is index of paired number)
                result[0] = index; // index of paired number (where complement value was stored)
                result[1] = i; // index of complement (step where element in list was found in map as stored complement)
                break;
            }else{
                map.put(target - numbers[i], i); // store complement value + current number index pairs to map
                // 3 -> map stores [6,2] => Complement = target - current= 9-3 = 7(stored value) index of 3 in list: 2 (stored)
            }
        }
        return result;
    }
}
