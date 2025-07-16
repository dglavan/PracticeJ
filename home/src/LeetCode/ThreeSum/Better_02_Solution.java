package LeetCode.ThreeSum;
//A better solution is using two pointers instead of one. This makes time complexity of O(nˆ2).
// To avoid duplicate, we can take advantage of sorted arrays, i.e., move pointers by >1 to use same element only once.

import java.util.ArrayList;
import java.util.Arrays;

public class Better_02_Solution {
    public static void main(String[] args){
        int[] input = {-1, 0, 1, 2, -1, -4};

        ArrayList<ArrayList<Integer>> output = threeSum(input);
        for(ArrayList<Integer> triplet : output){
            System.out.println(triplet);
        }
    }

    public static ArrayList<ArrayList<Integer>> threeSum(int[] nums){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(nums.length<3) return result;

        // sort Array
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            //avoid duplicate solutions
            if(i==0 || nums[i] > nums[i-1]){ // proceed only if i==0 or i new unique
                // nums[i] + nums[start] + nums[end] = 0 => nums[start] + nums[end] == -nums[i]
                int negate = -nums[i]; // target sum for next two numbers becomes negation of first

                int start = i+1; // pointer from beginning
                int end = nums.length-1; // pointer from end

                while (start<end){
                    // case 1 - Found match -> add triplets and move pointers inwards to keep searching
                    if(nums[start] + nums[end] == negate){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);

                        result.add(temp);
                        start++;
                        end--;

                        // avoid duplicate solutions for start and end
                        while (start < end && nums[end]==nums[end+1]){
                            end--;
                        }
                        while (start < end && nums[start]==nums[start-1]){
                            start++;
                        }
                        // case 2 - Sum too small => increment start pointer to get higher sum
                    } else if (nums[start]+ nums[end] < negate) {
                        start++;
                        // case 3 - Sum too big => decrement end pointer to get lower sum
                    } else end--;
                }
            }
        }
        return result;
    }
}
