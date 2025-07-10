package aaProblems;

// Find a pair of numbers that add up to a targeted sum in a sorted or unsorted array
// Input : [3,5,2,8,11] , Target = 10 => Output [2,8]

import java.util.HashSet;

public class PairOfNrsEqualSum {
    public static void main(String[] args){
        int[] array = {3,5,2,8,5,11};
        int sum = 10;

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for(int num: array){

            int complement = sum - num;

            if(set.contains(complement)){
                System.out.println("Pair found: [" + complement + ", " + num + "]");
                found = true;
            }

            set.add(num);
        }
        if(!found){
            System.out.println("Pairs not found!");
        }
    }
}





                // My HashMap Method - personal approach

//import java.util.HashMap;
//
//public class PairOfNrsEqualSum {
//    public static void main(String[] args) {
//        int[] array = {3, 5, 2, 8, 11, 5};
//        int sum = 10;
//
//        // Count occurrences
//        HashMap<Integer, Integer> countMap = new HashMap<>();
//        for (int num : array) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//
//        // Find valid pair
//        for (int num : array) {
//            int complement = sum - num;
//
//            if (countMap.containsKey(complement)) {
//                if (num == complement && countMap.get(num) < 2) {
//                    // Skip [5,5] if there's only one 5
//                    continue;
//                }
//                System.out.println("Pair found: [" + num + ", " + complement + "]");
//            }
//        }
//    }
//}

