package algo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<Integer>();
        lList.add(2);
        lList.add(3);
        lList.add(5);

        Set<String> hashSet = new HashSet<String>();
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        hashSet.add("5");

        for (String hs : hashSet) {
            System.out.println(hs);
        }

        System.out.println(" ---------- ");

        for (int i=0; i<lList.size(); i++){
            System.out.println(lList.get(i));
        }
    }
}
