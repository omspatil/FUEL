package Private;

public class Private1 {
    public static void main(String[] args) {
       Private2 ob = new Private2();
       ob.call();
    }
}
class Private2{
    private int a=10;
    private int b=20;
    public void call(){
        int c=a+b;
        System.out.println(c);
        System.out.println(a);
        System.err.println(b);
    }
      
}