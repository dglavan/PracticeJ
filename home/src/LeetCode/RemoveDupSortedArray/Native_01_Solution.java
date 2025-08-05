package LeetCode.RemoveDupSortedArray;

import java.util.Arrays;

// Given a sorted array, remove the duplicates in place such that each element appear
// only once and return the new length. Do not allocate extra space for another array
// you must do this in place with constant memory.
// For example, given input array A = [1,1,2], your function should return length = 2,
// and A is now [1,2].
public class Native_01_Solution {
    public static void main(String[] args){
        int[] input = {1, 1, 2};
        int newLen = removeDup(input);
        System.out.println("New Array: " + Arrays.toString(Arrays.copyOf(input, newLen)) +
                " of length: " + newLen);
    }

    public static int removeDup(int[] A){
        if (A.length < 2) return A.length;

        int j = 0; // j to keep track of the next position to place a unique element
        for (int i = 1; i < A.length; i++) { // Start iterating from index 1 to the end of the array using pointer i.
            if (A[i] != A[j]) { // If the current element A[i] is not equal to the last unique element
                // A[j], it's a new unique element.
                j++; // Move the unique element pointer forward.
                A[j] = A[i]; // Copy the new unique element to position j.
                // The first newLen elements of input will now be the unique values.
            }
        }
        // Since j is the index of the last unique element, the new length is j + 1.
        return j + 1; // (because index 1 - means size 2)
        // we are returning the size of new array with uniques only
    }
}
