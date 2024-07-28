package Problems;

//Write a program to find maximum between two numbers

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double maximum = findMaximum(num1, num2);
        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + maximum);
    }

    public static double findMaximum(double num1, double num2) {
        return num1 > num2 ? num1 : num2;
    }
}
