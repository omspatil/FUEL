package This_super;

public class Child extends Parent {
    int a=10;
    int b=20;
    public void m1(){
        int a =40;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        Child ob= new Child();
        ob.m1();
    }
}
