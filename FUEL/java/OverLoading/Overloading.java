package OverLoading;

public class Overloading {
    public void Car(){
        System.out.println("This is car without parameter");
    }
    public void Car(int price){
        System.out.println("This is car with int price="+price);
    }
    public void Car(String Brand){
        System.out.println("This is car with string Brand="+Brand);
    }
    public void Car(int price,String Brand){
        System.out.println("This is car with int price="+price+" and string Brand="+Brand);
    }
    public void Car(String Brand,int price){
        System.out.println("This is car with string Brand="+Brand+" and int price="+price);
    }
    public static void main(String[] args) {
        Overloading ob = new Overloading();
        ob.Car();
        ob.Car("BMW");
        ob.Car(1000000);
        ob.Car("Audi", 1000000000);
        ob.Car(1500000, "Thar");
    }
}
