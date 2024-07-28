package ExceptionHandling;

public class Exception2 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        System.out.println(array[0]);
        System.out.println(array[1]);

        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException...");
        }
    }
}