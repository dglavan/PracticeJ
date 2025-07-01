public class LargestElemInArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 8, 3, 4, 4};
        int largest = arr[0];
        for(int i : arr){
            if( largest <= i){
                largest = i;
            }
        }
        System.out.println("Largest element in list is: " + largest);
    }
}
