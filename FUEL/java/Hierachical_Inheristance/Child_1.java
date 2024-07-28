package Hierachical_Inheristance;

public class Child_1 extends Parent{
    public void Child1(){
        System.out.print("Child no 1");
    }
    public static void main(String[] args) {
        Child_1 ob = new Child_1();
        ob.Child1();
        ob.Father();
    }
}
