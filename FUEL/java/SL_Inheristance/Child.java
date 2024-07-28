package SL_Inheristance;

public class Child extends Parent{
    public void garage(){
        System.out.println("Garage from Child");
    }
    public static void main(String[] args) {
        Child ob=new Child();
        ob.garage();
        ob.bike();
        ob.car();
    }

}