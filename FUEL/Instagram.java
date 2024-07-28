import java.util.Scanner;

public class Instagram {
    public static void main(String[] args) {

        String correctUsername = "ompatil";
        String correctPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Instagram username: ");
        String username = scanner.nextLine(); 

        System.out.print("Enter your Instagram password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername)) {
            if (password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome to Instagram, " + username + "!");
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else {
            System.out.println("Username not found. Please sign up for an account.");
        }

        scanner.close();
    } 
}