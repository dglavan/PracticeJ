package LeetCode.InsertAndMergeInterval;

import java.sql.SQLOutput;
import java.util.ArrayList;


public class Native_01_Solution {
    public static void main(String[] args){
        ArrayList<Interval> input = new ArrayList<>();

        input.add(new Interval(1,3));
        input.add(new Interval(3,5));
        input.add(new Interval(6,7));
        input.add(new Interval(8,10));
        input.add(new Interval(12,16));

        Solution sol = new Solution();
        ArrayList<Interval> output = sol.insert(input, new Interval(4,9));

        for(Interval interval : output){
            System.out.println("[" + interval.start + "," + interval.end + "]");
        }
    }
}
