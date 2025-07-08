import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Element {
    int value;
    int originalIndex;

    Element(int value, int originalIndex) {
        this.value = value;
        this.originalIndex = originalIndex;
    }
}

public class BinarySearchIndexTracking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nr of elements:");
        int n = scanner.nextInt();
        Element[] elements = new Element[n];

        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            int val = scanner.nextInt();
            elements[i] = new Element(val, i); // each value paired to original index
                                               // memorize order of elements initialization
        }

        // Sort by value -> need sorted for Binary Search
        Arrays.sort(elements, Comparator.comparingInt(e -> e.value));

        System.out.println("Enter element to be found: ");
        int search = scanner.nextInt();

        // Binary Search itself
        int first=0, last=n-1;
        boolean found = false;

        while(first<=last){
            int middle = (first+last)/2;
            if(elements[middle].value == search){
                System.out.println("Element "+search+" was found at index: " + elements[middle].originalIndex);
                found = true;
                break;
            } else if (elements[middle].value < search) {
                first = middle+1;
            } else{
                last = middle-1;
            }
        }
        if(!found){
            System.out.println("Element "+search+" was not found!");
        }
    }
}
