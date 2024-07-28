package ExceptionHandling;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println("Start the program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B :  ");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("The Answer is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero");
        }
        sc.close();
        System.out.println("End the Program");
    }
}