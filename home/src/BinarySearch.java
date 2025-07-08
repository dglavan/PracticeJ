import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int c, first, middle, last, n, search;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nr of elements: ");
        n = scanner.nextInt();
        array = new int[n];

        System.out.println("Enter elements to initialize array: ");
        for(c=0;c<n;c++){
            array[c]=scanner.nextInt();
        }

        System.out.println("Enter element to find:");
        search = scanner.nextInt();

        first = 0;
        last = n-1;
        boolean found = false;
        Arrays.sort(array); // Binary search works only on sorted Arrays

        while(first <= last){
            middle = (first+last)/2;

            if(array[middle] == search){
                System.out.println("Element "+search+" was found!");
                found = true;
                break;
            } else if (array[middle] < search) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        if(!found){
            System.out.println("Element "+search+" was not found!");
        }
    }
}
