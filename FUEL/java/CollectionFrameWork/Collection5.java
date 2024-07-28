package CollectionFrameWork;

import java.util.*;

public class Collection5 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(30);
        al.add(40);
        al.add(10);
        al.add(70);
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));

        }
    }

}
