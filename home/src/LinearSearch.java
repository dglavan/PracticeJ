import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int c;
        int n;
        int search;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nr of elements(Array size): ");
        n = scanner.nextInt();
        array = new int[n];

        System.out.println("Enter "+n+" elements to initialize array values!");
        for(c=0;c<n;c++){
            array[c] = scanner.nextInt();
        }

        System.out.println("Enter value to find: ");
        search = scanner.nextInt();

        int count = 0;
        List<String > indexes = new ArrayList<>();
        for(c=0;c<n;c++){
            if(array[c]==search){
                indexes.add(Integer.toString(c));
                count++;
            }
        }
        if(count==0){
            System.out.println(search + " was not found in array!");
        }
        System.out.println("Element " + search +" was found at following indexes: " +indexes);
    }
}
