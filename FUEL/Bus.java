import java.util.Scanner;

class BusSuggestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your budget:");
        double budget = scanner.nextDouble();

        System.out.println("Available buses based on your budget:");

        if (budget < 500) {
            System.out.println("Sorry, there are no buses available within your budget.");
        } else if (budget >= 500 && budget < 1000) {
            System.out.println("1. Economy Class Bus");
            System.out.println("2. Local City Bus");
        } else if (budget >= 1000 && budget < 2000) {
            System.out.println("1. Deluxe Bus");
            System.out.println("2. Intercity Bus");
        } else if (budget >= 2000 && budget < 5000) {
            System.out.println("1. Semi-Sleeper Bus");
            System.out.println("2. Luxury Bus");
        } else if (budget >= 5000 && budget <= 10000) {
            System.out.println("1. Sleeper Bus");
            System.out.println("2. Volvo Multi-Axle Bus");
        } else {
            System.out.println("Sorry, there are no buses available within your budget.");
        }

        scanner.close();
    }
}
