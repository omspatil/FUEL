package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection2 {
    public static void main(String[] args) {

        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        LinkedList l1 = new LinkedList();
        System.out.println(l1.addAll(a1));
        l1.add(30);
        System.out.println(l1);
        System.out.println(l1.containsAll(a1));
        l1.removeAll(a1);
        System.out.println(l1.containsAll(a1));
        System.out.println(l1);
    }

}
