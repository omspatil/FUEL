package Problems;
//Write a program to find maximum between three numbers

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double maximum = findMaximum(num1, num2, num3);
        System.out.println("The maximum among " + num1 + ", " + num2 + ", and " + num3 + " is: " + maximum);
    }

    public static double findMaximum(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
