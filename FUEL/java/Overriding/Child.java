package Overriding;

public class Child extends Parent {
    public static void bike(){
        System.out.println("Modified bike");
    }
    public static void main(String[] args) {
        bike();
    }
}
