package String;

public class car {
    public static void main(String[] args) {
        car c=new car();
        System.out.println(c);
        System.out.println(c.toString());
        System.out.println(c.hashCode());

        car c1=new car();
        car c2=new car();
        System.out.println(c1.equals(c2));
    }
    
}