import java.util.Scanner;

public class Gov2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Candidate 1:");
        System.out.print("Enter candidate 1's name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter candidate 1's gender (Male/Female): ");
        String gender1 = scanner.nextLine();

        System.out.print("Enter candidate 1's age: ");
        int age1 = scanner.nextInt();

        scanner.nextLine(); // Consume newline character

        System.out.println("\nCandidate 2:");
        System.out.print("Enter candidate 2's name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter candidate 2's gender (Male/Female): ");
        String gender2 = scanner.nextLine();

        System.out.print("Enter candidate 2's age: ");
        int age2 = scanner.nextInt();

        // Check if both candidates are eligible for marriage
        boolean eligibleForMarriage = checkEligibilityForMarriage(gender1, age1, gender2, age2);

        // Display results
        if (eligibleForMarriage) {
            System.out.println("\nBoth candidates are eligible for marriage under government rules.");
        } else {
            System.out.println("\nBoth candidates are not eligible to marry each other under government rules.");
        }

        scanner.close();
    }

    // Method to check eligibility for marriage based on government rules
    private static boolean checkEligibilityForMarriage(String gender1, int age1, String gender2, int age2) {
        // Marriage age requirements (can be adjusted according to jurisdiction)
        int marriageAgeMale = 21;
        int marriageAgeFemale = 18;

        // Check if both candidates meet the marriage age requirements
        if (gender1.equalsIgnoreCase("male") && gender2.equalsIgnoreCase("female")) {
            return (age1 >= marriageAgeMale && age2 >= marriageAgeFemale);
        } else if (gender1.equalsIgnoreCase("female") && gender2.equalsIgnoreCase("male")) {
            return (age1 >= marriageAgeFemale && age2 >= marriageAgeMale);
        } else {
            return false; // Cannot marry if both candidates have the same gender
        }
    }
}
