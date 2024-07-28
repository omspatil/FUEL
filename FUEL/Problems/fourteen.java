package Problems;
//Write a program to input angles of a triangle and check whether triangle is valid or not

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three angles of the triangle:");
        System.out.print("Angle 1: ");
        int angle1 = scanner.nextInt();
        System.out.print("Angle 2: ");
        int angle2 = scanner.nextInt();
        System.out.print("Angle 3: ");
        int angle3 = scanner.nextInt();

        boolean isValid = isValidTriangle(angle1, angle2, angle3);

        if (isValid) {
            System.out.println("The triangle with angles " + angle1 + ", " + angle2 + ", " + angle3 + " is valid.");
        } else {
            System.out.println("The triangle with angles " + angle1 + ", " + angle2 + ", " + angle3 + " is not valid.");
        }
    }

    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // Check if each angle is greater than 0 and the sum of angles equals 180 degrees
        return angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3 == 180);
    }
}
