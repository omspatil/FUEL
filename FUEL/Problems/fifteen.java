package Problems;
//Write a program to input all sides of a triangle and check whether triangle is valid or not


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        boolean isValid = isValidTriangle(side1, side2, side3);

        if (isValid) {
            System.out.println("The triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is valid.");
        } else {
            System.out.println("The triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is not valid.");
        }
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        // Check if the sum of any two sides is greater than the third side
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
