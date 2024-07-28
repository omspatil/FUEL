package ML_Inheristance;

public class Child extends Grandparent{
    public void garage(){
        System.out.println("Garage from Child");
    }
    public static void main(String[] args) {
        Child ob=new Child();
        ob.garage();
        ob.bike();
        ob.car();
        ob.Plot();
    }

}
