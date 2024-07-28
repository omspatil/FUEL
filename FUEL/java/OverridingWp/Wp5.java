package OverridingWp;

public class Wp5 extends Wp4{
    public void Display(){
        super.Display();
        System.out.println("Blocked");
    }
    public void Calling(){
        super.Calling();
        System.out.println("Call with filters");
    }
    public void Status(){
        super.Status();  
        System.out.println("Upload video");
    }
    public static void main(String[] args) {
        Wp5 ob = new Wp5();
        ob.Display();
        ob.Calling();
        ob.Status();
    }
}
