package Problems;
//Write a program to input week number and print week day

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a week number (1-7): ");
        int weekNumber = scanner.nextInt();

        String weekDay = getWeekDay(weekNumber);

        if (weekDay != null) {
            System.out.println("The week day corresponding to week number " + weekNumber + " is " + weekDay + ".");
        } else {
            System.out.println("Invalid week number. Please enter a number between 1 and 7.");
        }
    }

    public static String getWeekDay(int weekNumber) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        if (weekNumber >= 1 && weekNumber <= 7) {
            return weekDays[weekNumber - 1];
        } else {
            return null;
        }
    }
}
