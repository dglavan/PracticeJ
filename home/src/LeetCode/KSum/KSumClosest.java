package LeetCode.KSum;

import java.util.*;

public class KSumClosest {
    public static void main(String[] args){
        int[] nums = {-1, 2, 1, -4, -5, 11};
        int target = 1;
        int k = 4;

        List<Integer> result = kSumClosest(nums, target, k);
        int sum = result.stream().mapToInt(i -> i).sum();

        System.out.println("Closest sum to target " + target + " is: " + sum);
        System.out.println("Triplet: " + result);
    }
    // wrapper function around helper method kSumHelper
    public static List<Integer> kSumClosest(int[] nums, int target, int k){
        Arrays.sort(nums);
        return kSumHelper(nums, target, k, 0);
    }
    private static List<Integer> kSumHelper(int[] nums, int target, int k, int start){
        int n = nums.length;
        List<Integer> closestCombo = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        // Base case: 2-sum
        if(k==2){
            int left = start, right = nums.length - 1;
            while (left < right){
                int sum = nums[left] + nums[right];
                int diff = Math.abs(sum - target);

                if(diff < minDiff){
                    minDiff = diff;
                    closestCombo = Arrays.asList(nums[left], nums[right]);
                }

                if(sum < target){
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return Arrays.asList(nums[left], nums[right]);
                }
            }
            return closestCombo;
        }

        // Recursive case: k > 2
        for(int i = start; i < n - k + 1; i++){
            if(i > start && nums[i] == nums[i -1]) continue; // skip duplicates

            List<Integer> subCombo = kSumHelper(nums, target-nums[i], k-1, i+1);

            if(!subCombo.isEmpty()){
                int sum = nums[i] + subCombo.stream().mapToInt(j -> j).sum();
                int diff = Math.abs(sum - target);

                if (diff < minDiff){
                    minDiff = diff;
                    closestCombo = new ArrayList<>();
                    closestCombo.add(nums[i]);
                    closestCombo.addAll(subCombo);
                }

                if(diff == 0) break; // early exit
            }
        }
        return closestCombo;
    }
}

