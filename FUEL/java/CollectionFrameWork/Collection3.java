package CollectionFrameWork;

import java.util.LinkedList;

public class Collection3 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println(l1);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        int[] a = { 10, 20, 30 };
        for (int i : a) {
            System.out.println(i);
        }

    }
}
