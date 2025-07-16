package LeetCode.TwoSum;

//Given an array of integers, find two numbers such that they add up to a specific target number.
// (Just first two numbers)
// Input: numbers={2, 7, 11, 15}, target=9  => Output: index1=1, index2=2
// Time complexity in worst case: O(nˆ2).

import java.util.Arrays;

public class Native_01_Solution {
    public static void main(String[] args){
        int[] input = {2,7,11,15,3,6};
        int target = 9;

        int[] result = twoSum(input,target); // Call Method

        //Print indexes (1-based)
        System.out.println("Indexes (1-based):" + Arrays.toString(result));

        //convert back to 0-based
        int index1 = result[0] - 1;
        int index2 = result[1] - 1;

        System.out.println("Values: [" + input[index1] + ", " + input[index2] + "]");
        System.out.println("Indexs (0-based): ["+ index1 + ", "+index2 + "]");


    }

    public static int[] twoSum(int[] numbers, int target){
        int[] ret = new int[2];
        for(int i=0; i<numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    ret[0] = i + 1;
                    ret[1] = j + 1;
                    return ret; // return Early if found
                }
            }
        }
        return ret;
    }
}

