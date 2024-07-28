package Problems;
//Write a program to count total number of notes in given amount


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] noteCounts = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            noteCounts[i] = amount / notes[i];
            amount %= notes[i];
        }

        System.out.println("Total number of notes:");

        for (int i = 0; i < notes.length; i++) {
            if (noteCounts[i] > 0) {
                System.out.println(notes[i] + " : " + noteCounts[i]);
            }
        }
    }
}
