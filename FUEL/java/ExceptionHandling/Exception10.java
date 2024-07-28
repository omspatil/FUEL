package ExceptionHandling;

public class Exception10 {

    static int divideAndSquare(int x, int y) {
        int z = x / y;
        return z * z;
    }

    public static void main(String[] args) {

        int a = 50, b = 0;
        if (b != 0) {
            int c = divideAndSquare(a, b);
            System.out.println(c);
        } else {
            System.out.println("undefined (division by zero)");
        }
    }

}