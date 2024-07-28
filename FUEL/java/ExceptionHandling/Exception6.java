package ExceptionHandling;

public class Exception6 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Null Poointer Exception...");
        }
    }
}
