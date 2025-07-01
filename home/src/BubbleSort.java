public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        for(int i=0; i<n;i++){ // each outer pass moves highest to last position
            // each inner pass compairs first to next and moves highest at the back of array
            for(int j=0; j<n-i-1;j++){ // after each outer loop highest in back => -i to not compare to those already sorted in back
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num:arr){
            System.out.println(num + " ");
        }
    }
}
