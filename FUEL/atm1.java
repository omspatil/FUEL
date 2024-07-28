import java.util.Scanner;

public class atm1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1.Withdraw cash");
            System.out.println("2.Reset Pin");
            System.out.println("3.Deposite");
            System.out.println("4.Check Balance");
            System.out.println("5.Exit");

            System.out.println("choose the operation:");
            Scanner sc = new Scanner(System.in);
            int bamt = 50000;
            int anumber = 12456789;
            int mnumber = 1234567890;
            int otp = 1234;
            int pin = 1111;
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("enter pin: ");
                    int ipin = sc.nextInt();
                    if (ipin == pin) {
                        System.out.println("Enter the Amount:");
                        int amt = sc.nextInt();
                        if (amt <= bamt) {
                            bamt -= amt;
                            System.out.println("CASH withdraw Succesfully.. ");
                            System.out.println("Remaining balance: " + bamt);
                            System.out.println("Take Your Recipt.. ");
                        } else {
                            System.out.println("Not enough Balance.... ");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter Pin: ");
                    int ypin = sc.nextInt();
                    if (ypin == pin) {
                        System.out.println("Enter the Account Number: ");
                        int acc_number = sc.nextInt();
                        if (acc_number == anumber) {
                            System.out.println("Enter your Mobile Number:  ");
                            int number = sc.nextInt();
                            if (number == mnumber) {
                                System.out.println("Enter the OTP that have sended  on your Mobile : ");
                                int motp = sc.nextInt();
                                if (motp == otp) {
                                    System.out.println("Enter New Pin: ");
                                    int npin = sc.nextInt();
                                    pin = npin;
                                    System.out.println("Pin is Updated....");

                                } else {
                                    System.out.println("Invalid OTP ");
                                }
                            } else {
                                System.out.println("invalid mobile number.. ");
                            }
                        } else {
                            System.out.println("Invalid Account Number.... ");
                        }
                    } else {
                        System.out.println("Invalid Pin....");
                    }
                    break;
                case 3:
                    System.out.println("Enter Pin: ");
                    int vpin = sc.nextInt();
                    if (vpin == pin) {
                        System.out.println("Enter the Amount to deposit: ");
                        int damt = sc.nextInt();
                        System.out.println("Enter no.of notes of 1000: ");
                        int count = sc.nextInt();
                        bamt = bamt + damt;
                        System.out.println("Amount Deposited Succesfully.....");
                    } else {
                        System.out.println("Invalid PIN.. ");
                    }
                    break;
                case 4:
                    System.out.println("Enter Pin: ");
                    int zpin = sc.nextInt();
                    if (zpin == pin) {
                        System.out.println("Enter Account Number: ");
                        int zaccount = sc.nextInt();
                        if (zaccount == anumber) {
                            System.out.println("Current Balance: " + bamt);
                        } else {
                            System.out.println("Invalid account number.. ");
                        }
                    } else {
                        System.out.println("Invalid Pin.. ");
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}