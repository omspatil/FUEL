package Constructor;

public class Parameterized {
    public void mul(int a, int b){
        int c=a*b;
        System.out.println("Multiplication is "+c);
    }
    public static void main(String[] args) {
        Parameterized ob= new Parameterized();
        ob.mul(10, 20);
    }
}
