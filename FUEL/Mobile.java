import java.util.Scanner;

class MobileSuggestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your budget:");
        double budget = scanner.nextDouble();

        System.out.println("Available mobile phones based on your budget:");

        if (budget < 10000) {
            System.out.println("Sorry, there are no mobile phones available within your budget.");
        } else if (budget >= 10000 && budget < 20000) {
            System.out.println("1. Xiaomi Redmi Note 10");
            System.out.println("2. Samsung Galaxy M32");
            System.out.println("3. Realme Narzo 30 Pro");
        } else if (budget >= 20000 && budget < 40000) {
            System.out.println("1. Samsung Galaxy A52");
            System.out.println("2. OnePlus Nord 2");
            System.out.println("3. Xiaomi Mi 11 Lite");
        } else if (budget >= 40000 && budget < 60000) {
            System.out.println("1. iPhone SE (2020)");
            System.out.println("2. Google Pixel 5a");
            System.out.println("3. Samsung Galaxy S21 FE");
        } else if (budget >= 60000 && budget <= 100000) {
            System.out.println("1. iPhone 13");
            System.out.println("2. Samsung Galaxy S21 Ultra");
            System.out.println("3. OnePlus 9 Pro");
        } else {
            System.out.println("Sorry, there are no mobile phones available within your budget.");
        }

        scanner.close();
    }
}
