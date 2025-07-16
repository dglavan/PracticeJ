package LeetCode.MergeIntervals;

import java.util.*;

// Given a collection of intervals, merge all overlapping intervals.
// Given [1,3],[2,6],[8,10],[15,18], return [1,6],[8,10],[15,18].
// The key to solve this problem is defining a Comparator first to sort the arraylist of Intervals.
// And then merge some intervals. The take-away message from this problem is utilizing the advantage of sorted list/array

public class Native_01_Solution {
    public static void main(String[] args){
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 3));
        input.add(new Interval(2, 6));
        input.add(new Interval(8, 10));
        input.add(new Interval(15, 18));

        Solution sol = new Solution();
        ArrayList<Interval> output = sol.merge(input);

        for (Interval interval : output) {
            System.out.println("[" + interval.start + "," + interval.end + "]");
        }
    }
}

class Interval{
    int start;
    int end;

    Interval(){
        start = 0;
        end = 0;
    }

    Interval(int s, int e){
        start = s;
        end = e;
    }
}

class IntervalComparator implements Comparator<Interval>{
    public int compare(Interval i1, Interval i2){
        return i1.start - i2.start;
    }
}


