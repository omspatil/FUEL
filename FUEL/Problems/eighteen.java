package Problems;
//Write a program to calculate profit or loss


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        double profitOrLoss = sellingPrice - costPrice;

        if (profitOrLoss > 0) {
            System.out.println("Profit of $" + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss of $" + Math.abs(profitOrLoss));
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}
