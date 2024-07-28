import java.util.Scanner;

class WeekDayNamePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number digit representing the day of the week
        System.out.print("Enter a number digit (1-7) representing the day of the week: ");
        int dayNumber = scanner.nextInt();

        // Print the name of the week day based on the given number digit
        String weekDayName = getWeekDayName(dayNumber);
        if (weekDayName != null) {
            System.out.println("The day corresponding to digit " + dayNumber + " is: " + weekDayName);
        } else {
            System.out.println("Invalid input! Please enter a number digit between 1 and 7.");
        }

        scanner.close();
    }

    // Method to get the name of the week day based on the given number digit
    private static String getWeekDayName(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return null; // Return null for invalid input
        }
    }
}
