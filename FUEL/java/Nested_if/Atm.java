package Nested_if;
import java.util.Scanner;
public class Atm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Accno=987654321;
        long Phone=9172548056l;
        int balance = 10000;
        int PINN = 1234;
        System.out.println("Welcome to the ATM!");
        System.out.println("Please Enter Your ATM card");
        int option;
        do{
            System.out.println("Main Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Reset Pin");
            System.out.println("5. Exit");
            System.out.println("Please select an option:");
            option = scanner.nextInt();
        switch (option) {
            case 1:
              
                System.out.println("How much money would you like to withdraw?");
                int amountToWithdraw = scanner.nextInt();
                System.out.println("Please enter your PIN:");
                int Pin = scanner.nextInt();
                if (balance >= amountToWithdraw) {
                    if (Pin != PINN) {
                        System.out.println("Invalid PIN. Please try again.");
                       
                    }else{
                    
                    balance -= amountToWithdraw;
                    System.out.println("Please collect your cash.");
                    System.out.println("please collect the reciept");
                }
                } else {
                    System.out.println("Insufficient balance.");
                }

                break;
            
            case 2:
                
                System.out.println("How much money would you like to deposit?");
                int amountToDeposit = scanner.nextInt();
                System.out.println("Please enter your PIN:");
                int pin = scanner.nextInt();
                if (pin != PINN) {
                    System.out.println("Invalid PIN. Please try again.");
                } else {
                    balance += amountToDeposit;
                    System.out.println("Your deposit was successful.");
                    System.out.println("please collect the reciept");
                }
                break;
            
            case 3:
                System.out.println("please enter your pin:");
                int r = scanner.nextInt();
                if (r != PINN) {
                    System.out.println("Invalid PIN. Please try again.");                   
                }
                else{
                    System.out.println("Your current balance is: " + balance);
                }
                break;
            
            case 4:
                System.out.println("Please enter your Account Number:");
                Accno = scanner.nextInt();
                if(Accno==987654321){
                    System.out.println("Please enter your Registered mobile number:");
                    long Phon = scanner.nextLong();
                    if(Phon==Phone){
                        System.out.println("Please enter OTP you recieved on your registered mobile number:");
                        @SuppressWarnings("unused")
                        int Otp = scanner.nextInt();
                        System.out.println("Please enter your new pin:");
                        int PIN = scanner.nextInt(); 
                        PINN = PIN;
                        System.out.println("You have Successfully changed your pin.");
                    }else{
                        System.out.println("Invalid mobile no.");
                    }

                }else{
                    System.out.println("Invalid Account no.");
                }
                
                             
            case 5:
            System.out.println("Thank you, Have a nice day.");
                  
            }      
        }while(option!=5); 
        scanner.close();      
    }
}