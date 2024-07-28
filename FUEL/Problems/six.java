package Problems;
//Write a program to check whether a year is leap year or not

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4
        // But if the year is divisible by 100, it must also be divisible by 400 to be a leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
