import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HashMapDemo {
    public static void main(String[] args) {
    //Declaration
        HashMap hm = new HashMap();
        // Map hm = new HashMap();
        // HashMap<Integer, String> hm = new HashMap<>();

        //Adding elements to HashMap
        hm.put(101, "John");
        hm.put(102, "Scott");
        hm.put(103, "Mary");
        hm.put(104, "Scott");
        hm.put(102, "David"); // Overwrites "Scott" with "David" for key 102

        System.out.println(hm);

        //Size
        System.out.println("Size of HashMap: " +hm.size());

        //Removing key-value pair
        hm.remove(103);
        System.out.println("After removing key-value from 103: " + hm);

        //Accessing a value using key
        System.out.println("Value at key 102 is: " + hm.get(102));

        // Getting all keys , values, and key-value pairs
        System.out.println("Keys: " + hm.keySet());
        System.out.println("Values: " + hm.values());
        System.out.println("Key-value pairs: " + hm.entrySet());

        //Read elements using for-each loop
//        System.out.println("Using for each loop:");
//        for(Object k: hm.keySet()){
//            System.out.println(k + "  " + hm.get(k));
//        }

        //Read elements using iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        //Clearing elements
        System.out.println("\nDo we have Scott value ? " + hm.containsValue("Scott"));
        hm.clear();
        System.out.println("Is HashMap empty after clear? " + hm.isEmpty());
        System.out.println("Do we have Scott value ? " + hm.containsValue("Scott"));
    }
}