package OverridingWp;

public class Wp2 extends Wp1 {
    public void Display(){
        super.Display();
        System.out.println("Doble tick");
    }
    public void Calling(){
        System.out.println("Voice call");
    }
}
