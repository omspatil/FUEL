package ML_Inheristance;
class Parent {
    int a = 88;
    int b = 00;
}

class Child extends Parent {
    int a = 10;
    int b = 20;

    public void m1() {
        int a = 30;
        int b = 40;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
    }
}
