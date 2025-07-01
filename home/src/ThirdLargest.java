public class ThirdLargest {
    public static void main(String[] args){
        int[] arr = {33, 88, 33, 33, 33, 33, 32};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for(int num:arr){
            if(num > first){
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num !=second && num != first) {
                third = num;
            }
        }
        if(third == Integer.MIN_VALUE){
            System.out.println("No 3rd largest unique elem found!");
        }
        else {
            System.out.println("3rd Largest elem: "+ third);}

    }
}
