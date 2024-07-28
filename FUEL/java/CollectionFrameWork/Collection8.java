package CollectionFrameWork;

import java.util.*;

public class Collection8 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("10");
        l1.add("java");
        l1.add("30.60");
        for (String i : l1) {
            System.out.println(i);
        }
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l1.add("10");
        l1.add("java");
        l1.add("30.60");
        l2.add(10);
        l2.add(20);
        l2.add(30);

        for (Integer z : l2) {
            System.out.println(z);
        }
        LinkedList<Object> l3 = new LinkedList();
        l3.add("10");
        l3.add("java");
        l3.add("30.60");
        l3.add(null);
        for (Object z : l3) {
            System.out.println(z);
        }
    }
}
