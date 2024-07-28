import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mypin = 0000;
        int currbal = 10000;
        System.out.println("INSERT YOUR CARD");
        System.out.println("Withdraw"+"\n"+"Resetpin"+"\n"+"Deposit"+"\n"+"Current Balance");
        System.out.println("Enter the option :");
        String transaction = in.next();
        switch (transaction) {
            case "w":
                System.out.println("Enter your pin :");
                int pin = in.nextInt();
                if (pin == mypin) {
                    System.out.println("WELCOME TO PATIL BANK!!!");
                } else {
                    System.out.println("Invalid PIN! Transaction aborted.");
                    break;
                }
                System.out.println("Enter the amount to withdraw : ");
                int withamt = in.nextInt();
                if (withamt > currbal) {
                    System.out.println("Insufficient balance! Transaction aborted.");
                } else {
                    currbal -= withamt;
                    System.out.println("Amount withdrawn successfully.");
                }
                break;

            case "r":
                System.out.println("Enter your current PIN:"); 
                int oldPin = in.nextInt();
                if (oldPin == mypin) {
                    System.out.println("Enter your new PIN:");
                    int newPin = in.nextInt();
                    mypin = newPin;
                    System.out.println("PIN reset successful.");
                } else {
                    System.out.println("Invalid PIN! Transaction aborted.");
                }
                break;

            case "d":
                System.out.println("Enter the amount to deposit:");
                int depositAmt = in.nextInt();
                currbal += depositAmt;
                System.out.println("Deposit successful.");
                break;

            case "c":
                System.out.println("Your current balance is: " + currbal);
                break;

            default:
                System.out.println("Invalid transaction.");
                break;
        }
        System.out.println("Thank you for using our services. Have a nice day!");
    }
}
