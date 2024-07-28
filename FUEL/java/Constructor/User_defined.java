package Constructor;

public class User_defined {
    int a;
    float b;
    char c;
    boolean d;
    String e;
    User_defined(){
        a=10;
        b=10.10f;
        c='H';
        d=true;
        e="Aditya";
    }
    public void demo(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    public static void main(String[] args) {
        User_defined ob= new User_defined();
        ob.demo();
    }
}
