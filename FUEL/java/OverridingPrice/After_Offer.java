package OverridingPrice;

public class After_Offer extends Before_Offer {
    public void OnePlus(){
        super.Oneplus();
        System.out.println("Offer Price=27,499");
    }
    public void Mi(){
        super.Mi();
        System.out.println("Offer Price=15,450");

    }
    public static void main(String[] args) {
        After_Offer ob = new After_Offer();
        ob.OnePlus();
        ob.Mi();
    }
}
