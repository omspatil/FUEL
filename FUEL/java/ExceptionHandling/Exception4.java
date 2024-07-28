package ExceptionHandling;

import java.util.*;

public class Exception4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 10, 20, 30, 40, 50 };
        // System.out.println("Enter the position");
        // int b = sc.nextInt();
        try {
            System.out.println(10 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array size");
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        } catch (NullPointerException e) {
            System.out.println("Empty block");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }

    }

}
