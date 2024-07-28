package Problems;
//Write a program to check whether the triangle is equilateral, isosceles or scalene triangle

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

        String triangleType = getTriangleType(side1, side2, side3);

        System.out.println("The triangle is a " + triangleType + " triangle.");
    }

    public static String getTriangleType(double side1, double side2, double side3) {
        if (side1 == side2 && side2 == side3) {
            return "equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
