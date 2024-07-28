package OverLoading;
import java.util.Scanner;

public class methodoverloading {
    // Method to print the cost of the car
    public void car(int cost) {
        System.out.println(cost);
    }

    // Method to print the brand of the car
    public void car(String brand) {
        System.out.println(brand);
    }

    // Method to print both the cost and brand of the car
    public void car(int cost, String brand) {
        System.out.println(cost);
        System.out.println(brand);
    }

    // Method to print both the brand and cost of the car
    public void car(String brand, int cost) {
        System.out.println(cost + " " + brand);
    }

    // Method to print the brand, cost, and power of the car
    public void car(String brand, int cost, String color) {
        System.out.println(cost + " " + brand + " " + color);
    }

    // Main method to test the overloaded car methods
    public static void main(String[] args) {
        methodoverloading m = new methodoverloading();
        Scanner scanner = new Scanner(System.in);

        // Taking input for each parameter using Scanner
        System.out.print("Enter cost of the car: ");
        int cost = scanner.nextInt();

        System.out.print("Enter brand of the car: ");
        String brand = scanner.next();

        System.out.print("Enter color of the car: ");
        String color = scanner.next();

        // Calling the car method with the input values
        m.car(cost);
        m.car(brand);
        m.car(cost, brand);
        m.car(brand, cost);
        m.car(brand, cost, color);

        // Closing the scanner
        scanner.close();
    }
}
