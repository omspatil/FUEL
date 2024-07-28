package OverridingWp;

public class Wp4 extends Wp3{
    public void Display(){
        super.Display();
        System.out.println("Offline ");
    }
    public void Calling(){
        super.Calling();
        System.out.println("Group Call");
    }
    public void Status(){
        System.out.println("Upload image");
    }
}
