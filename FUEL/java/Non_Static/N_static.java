package Non_Static;

import Non_static1.Div;

public class N_static {
    public void Ad(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("Adition is "+c);
    }
    public void Sb(){
        int a=10;
        int b=20;
        int c=b-a;
        System.out.println("Substraction is "+c);
    }
    public static void main(String[] args) {
        N_static ob =new N_static();
        ob.Ad();
        ob.Sb();
        Mul ob1 = new Mul();
        ob1.Multiply();
        Div ob2 = new Div();
        ob2.division(10,20);
    }
}
