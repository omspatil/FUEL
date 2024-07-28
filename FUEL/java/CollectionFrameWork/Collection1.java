package CollectionFrameWork;

import java.util.ArrayList;

public class Collection1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add("JAva");
        al.add(10);
        al.add(null);
        al.add(30.50);

        System.out.println(al);
        System.out.println("----------------------");
        System.out.println(al.get(2));
        System.out.println("----------------------");
        al.remove(3);
        System.out.println("----------------------");
        System.out.println(al);
        System.out.println("----------------------");
        System.out.println(al.isEmpty());
        System.out.println("----------------------");
        al.clear();
        System.out.println("----------------------");

        System.out.println(al.isEmpty());
        System.out.println("-----------------------");

        ArrayList a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(10);
        System.out.println(a.indexOf(10));
        System.out.println(a.lastIndexOf(10));
        System.out.println(a.indexOf(100));

    }
}
