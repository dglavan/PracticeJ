package JavaCollectionEx;

import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Alex");
        list.add("Martin");
        list.add("ebollass");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Size of list at this point: "+ list.size());
        System.out.println("List is empty now: " +list.isEmpty());
        list.remove(0);
        list.remove("Martin");
        list.remove(0);
        System.out.println("List is empty now...: " + list.isEmpty());
    }
}
