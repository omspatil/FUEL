import java.util.Scanner;

public class Gov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter candidate's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter candidate's gender (Male/Female): ");
        String gender = scanner.nextLine();

        System.out.print("Enter candidate's age: ");
        int age = scanner.nextInt();

        if (gender.equalsIgnoreCase("male")) {
            if (age >= 21) {
                System.out.println(name + " is eligible for marriage.");
                if (age >= 18) {
                    System.out.println(name + " is eligible for voting.");
                } else {
                    System.out.println(name + " is not eligible for voting yet.");
                }
            } else {
                System.out.println(name + " is not eligible for marriage yet.");
                System.out.println(name + " is not eligible for voting yet.");
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age >= 18) {
                System.out.println(name + " is eligible for marriage.");
                System.out.println(name + " is eligible for voting.");
            } else {
                System.out.println(name + " is not eligible for marriage yet.");
                System.out.println(name + " is not eligible for voting yet.");
            }
        } else {
            System.out.println("Invalid gender input.");
        }

        scanner.close();
    }
}
