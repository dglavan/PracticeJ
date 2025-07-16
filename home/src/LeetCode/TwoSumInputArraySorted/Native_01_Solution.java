package LeetCode.TwoSumInputArraySorted;
// 2SUM problem for input sorted array
import java.util.Arrays;

public class Native_01_Solution {
    public static void main(String[] args){
        int[] ex = {1,2,3,6,7,11}; // input sorted array
        int target = 8;

        int[] res = twoSum(ex,target);
        System.out.println("Elements: [" + ex[res[0]] + ", " +ex[res[1]] +"]" + " found at indexes: " + Arrays.toString(res));
    }

    public static int[] twoSum(int[] numbers, int target){
        if(numbers == null || numbers.length == 0){
            return null;
        }

        int i = 0;
        int j = numbers.length - 1;

        while (i<j){
            int x = numbers[i]+numbers[j];

            if(x < target){
                ++i;
            } else if (x > target) {
                j--;
            } else {
                return new int[] {i,j};
            }
        }
        return null;
    }
}
