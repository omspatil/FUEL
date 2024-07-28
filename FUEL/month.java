import java.util.Scanner;

class MonthNamePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number digit representing the month
        System.out.print("Enter a number digit (1-12) representing the month: ");
        int monthNumber = scanner.nextInt();

        // Print the name of the month based on the given number digit
        String monthName = getMonthName(monthNumber);
        if (monthName != null) {
            System.out.println("The month corresponding to digit " + monthNumber + " is: " + monthName);
        } else {
            System.out.println("Invalid input! Please enter a number digit between 1 and 12.");
        }

        scanner.close();
    }

    // Method to get the name of the month based on the given number digit
    private static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return null; // Return null for invalid input
        }
    }
}
