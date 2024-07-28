package posttest;
//WAP for withdrawl money with the help of scanner class.

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        // Assuming initial balance
        double balance = 1000.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM");
        System.out.println("Current Balance: $" + balance);

        System.out.print("Enter amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();

        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }

        scanner.close();
    }
}
