import java.util.*;

public class CommElemInArrays {
    public static void main(String[] args){


        //Efficient Method
        Integer[] arr1 = {1, 2, 3, 4, 5, 6};
        Integer[] arr2 = {1, 2, 5, 6, 7};
        Integer[] arr3 = {1, 5, 6};

        // Create sets from arrays
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(arr3));

        // Perform intersection
        set1.retainAll(set2); // set1 now contains elements common to arr1 and arr2
        set1.retainAll(set3); // set1 now contains elements common to all three

        System.out.println("Common elements: " + set1);


        // Basic Method Step-by-Step
//        int[] arr = {1,2,3,4,5,6};
//        int[] arr2 = {1,2,5,6,7};
//        int[] arr3 = {1,5,6};
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for(int num : arr){
//            set.add(num);
//        }
//        HashSet<Integer> set2 = new HashSet<>();
//        for(int num : arr2){
//            if(set.contains(num)){
//                set2.add(num);
//            }
//        }
//        HashSet<Integer> common = new HashSet<>();
//        System.out.println(set2);
//        for(int num: arr3){
//            common.add(num);
//        }
//        System.out.println(common);
//        for(int num: set2){
//            if(common.contains(num)){
//                System.out.println("Common elements : " + num);
//            }
//        }


    }
}
