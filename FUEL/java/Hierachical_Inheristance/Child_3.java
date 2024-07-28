package Hierachical_Inheristance;

public class Child_3 extends Parent{
    public void Child3(){
        System.out.print("Child no 3");
    }
    public static void main(String[] args) {
        Child_3 ob = new Child_3();
        ob.Child3();
        ob.Father();
    }
}
