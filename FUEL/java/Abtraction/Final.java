package Abtraction;

public class Final extends Example {

    @Override
    public void demo() {
        
    }

    @Override
    public void Csmss() {
        
    }

    @Override
    public void Tpo() {
        System.out.println("I am TPO");
    }

    public void HOD(){
        System.out.println("I am HOD of cse");
    }
    public static void main(String[] args) {
        Final ob= new Final();
        ob.HOD();
        ob.Tpo();
    }
    
}