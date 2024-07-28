package Problems;
//Write a program to input month number and print month Name

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

        String monthName = getMonthName(monthNumber);

        if (monthName != null) {
            System.out.println("The month corresponding to month number " + monthNumber + " is " + monthName + ".");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }

    public static String getMonthName(int monthNumber) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            return monthNames[monthNumber - 1];
        } else {
            return null;
        }
    }
}
