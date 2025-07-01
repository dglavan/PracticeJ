import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5, 5};
        Set myset = new HashSet<>();
        for(int num : arr){
            myset.add(num);
        }

        // one line solution
//        Set<Integer> myset = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        System.out.println(myset);
    }
}
