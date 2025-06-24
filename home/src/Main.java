import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alice");    //String
        myList.add("25");       //Integer as String
        myList.add("3.14");     //Double as String
        myList.add("true");     //Boolean as String
        myList.add("A");        //Character as String
        myList.add("null");     //Null value
        myList.add("25");       //Duplicate value
        myList.add("Alice");    //Duplicate String

        System.out.println("List after adding elements: " + myList);

        myList.add(2, "Inserted element");
        System.out.println("After inserting an element: " + myList);

        System.out.println("Element at index 3: " + myList.get(3));

        myList.set(1, "99");
        System.out.println("After modif elem at index 1: " + myList);

        myList.remove(4);
        System.out.println("After removing elem index 4: " + myList);

        myList.remove("Alice");
        System.out.println("After removing Alice: " + myList);

        System.out.println("List contains '3.14' ?: " + myList.contains("3.14"));

        System.out.println("ArrayList size: " + myList.size());

        System.out.println("Is ArrayList empty? : " + myList.isEmpty());

        //Iterating through ArrayList Using for-loop
//        System.out.println("\nIterating using for-loop:");
//
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }

        //Iterating through ArrayList Using for-each
        for (Object x: myList){
            System.out.println(x);
        }

        System.out.println("\nIterating using iterator:");
        Iterator<String> it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        myList.clear();
        System.out.println("Is list empty after clear? " + myList.isEmpty());
    }
}