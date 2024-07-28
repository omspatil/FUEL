package CollectionFrameWork;

import java.util.*;

public class Collection4 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(1, 6);
        a.add(1, 50);
        System.out.println(a);
        a.set(1, 60);
        System.out.println(a);

    }
}
