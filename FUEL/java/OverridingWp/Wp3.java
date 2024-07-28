package OverridingWp;

public class Wp3 extends Wp2{
    public void Display(){
        super.Display();
        System.out.println("blue tick");
    }
    public void Calling(){
        super.Calling();
        System.out.println("Video call");
    }
}
