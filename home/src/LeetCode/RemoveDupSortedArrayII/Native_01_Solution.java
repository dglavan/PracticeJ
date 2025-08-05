package LeetCode.RemoveDupSortedArrayII;
// For example, given sorted array A = [1,1,1,2,2,3], your function should return length = 5,
// and A is now [1,1,2,2,3].
public class Native_01_Solution {
    public static void main(String[] args){
        int[] A = {1, 1, 1, 2, 2, 3};
        System.out.println(Solution.removeDup(A));
    }
    public static class Solution{
        public static int removeDup(int[] A){
            if(A==null || A.length==0) return 0;

            int pre = A[0]; // previous element being tracked
            boolean flag = false; // whether we’ve already seen a duplicate once
            int count = 0; // how many elements we skip (remove)

            int o = 1; // index for updating

            for(int i=1; i<A.length;i++){
                int curr = A[i];

                if(curr==pre){ // if duplicate
                    if(!flag){ // if first time dup write + Set flag = true;
                        flag = true; // (mark that we’ve now used our one allowed duplicate)
                        A[o++] = curr; // Write curr to the output position o, and increment o.

                        continue;
                    } else{ // if second time dup skip writing and count
                        count++;
                    }
                } else { // If new (non-duplicate) value
                    pre = curr; // new number becomes previous
                    A[o++] = curr; // write it to output position and increment position after
                    flag = false; // reset duplicate flag
                }
            }
            return A.length - count;
        }
    }
}
