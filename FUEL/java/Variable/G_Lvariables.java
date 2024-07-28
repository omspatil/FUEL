package Variable;

public class G_Lvariables {
    int a=10;
    static int b=20;
    public void m1(){
        int c=30;
        System.out.println(c);
    }
    public void m2(){
        System.out.println(a);
        System.out.println(b);
    //  System.out.println(c);    c is local variable of m1
    }
    public static void m3(){
    //  System.out.println(a);    we can call non static global variable in static method    
        System.out.println(b);
    //  System.out.println(c);    c is local variable of m1
    }
    public static void main(String[] args) {
        G_Lvariables ob=new G_Lvariables();
        ob.m1();
        ob.m2();
    //  ob.m3();    static method should call by static way
        m3();
    }
}
