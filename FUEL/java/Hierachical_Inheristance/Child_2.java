package Hierachical_Inheristance;

public class Child_2 extends Parent {
    public void Child2(){
        System.out.print("Child no 2");
    }
    public static void main(String[] args) {
        Child_2 ob = new Child_2();
        ob.Child2();
        ob.Father();
    }
}
