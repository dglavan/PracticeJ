import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HashSetDemo {
    public static void main(String[] args) {
        //Declaration
        HashSet myset = new HashSet();
//        Set myset = new HashSet();
//        HashSet <String> myset = new HashSet<String>();  - Accepts only String type input

        //Adding elements to HashSet
        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add(true);
        myset.add('A');
        myset.add(100);
        myset.add(null);
        myset.add(null);

        //Printing elements of set
        System.out.println(myset);

        //Size of HashSet
        System.out.println("Size of HashSet: " + myset.size());

        //Removing element
        myset.remove(10.5);
        System.out.println("After removing elem: " + myset);

       //Converting HashSet to ArrayList
       ArrayList myList = new ArrayList(myset);
       System.out.println("List obtained by converting set: "+ myList);
       System.out.println("Accessing element at index 2 from new list: " +myList.get(2));

       //Read elements of set using for..each
//        for(Object x:myset){
//            System.out.println(x);
//        }

        //Read elements using iterator
        Iterator<Object> it = myset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Clear set
        myset.clear();
        System.out.println("Is HashSet empty after clear? : " + myset.isEmpty());
    }
}