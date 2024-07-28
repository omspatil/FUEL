package Nested_if;
import java.util.Scanner;
public class Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your gender: (male/female) ");
        String gender = sc.nextLine();
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            if (gender.equals("male")) {
                System.out.println("You are eligible to vote.");
                if (age >= 21) {
                    System.out.println("You are eligible for marriage.");
                }
                if (age >= 18 && age <= 35) {
                    System.out.println("You are eligible for a government job.");
                }
            } else if (gender.equals("female")) {
                System.out.println("You are eligible to vote.");
                if (age >= 18) {
                    System.out.println("You are eligible for marriage.");
                }
                if (age >= 18 && age <= 35) {
                    System.out.println("You are eligible for a government job.");
                }
            } else {
                System.out.println("Invalid input.");
            }
        } else {
            System.out.println("You are not eligible for voting, marriage, or government job.");
        }
        
        sc.close();
    }
}