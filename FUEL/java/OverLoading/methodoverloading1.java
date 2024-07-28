package OverLoading;
class StaticMethodOverloading {
    // Overloaded static method to find the maximum of two integers
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    // Overloaded static method to find the maximum of three integers
    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // Overloaded static method to find the maximum of two doubles
    public static double findMax(double a, double b) {
        return Math.max(a, b);
    }

    // Overloaded static method to find the maximum of three doubles
    public static double findMax(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    // Main method to test the overloaded static methods
    public static void main(String[] args) {
        System.out.println("Maximum of 5 and 10: " + findMax(5, 10)); // Calls the first findMax method
        System.out.println("Maximum of 5, 10, and 15: " + findMax(5, 10, 15)); // Calls the second findMax method
        System.out.println("Maximum of 3.5 and 2.5: " + findMax(3.5, 2.5)); // Calls the third findMax method
        System.out.println("Maximum of 3.5, 2.5, and 4.5: " + findMax(3.5, 2.5, 4.5)); // Calls the fourth findMax method
    }
}
