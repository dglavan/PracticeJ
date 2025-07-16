package LeetCode.TwoSumDataStructureDesign;


public class DataStructureDesign {
    public static void main(String[] args) {
        TwoSum.add(1);
        TwoSum.add(3);
        TwoSum.add(5);
        System.out.println(TwoSum.find(4));
        System.out.println(TwoSum.find(8));
        TwoSum.add(6);
        System.out.println(TwoSum.find(14));
        System.out.println(TwoSum.find(7));
        TwoSum.add(5);
        System.out.println(TwoSum.find(10));
    }
}
        //Internal map looks like:
//        {
//            1:1,
//            3:1,
//            5:2,
//            6:1
//        }

