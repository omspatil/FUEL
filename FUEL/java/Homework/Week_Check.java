package Homework;

import java.util.Scanner;

public class Week_Check {
    public static void main(String[] args) {
        System.out.println("Enter a week no: ");
        Scanner sc = new Scanner(System.in);
        int choice= sc.nextInt();
        String Week;
    
        switch(choice){
            case 1:
            Week="Sunday";
            break;
            case 2:
            Week="Monday";
            break;
            case 3:
            Week="Tuesday";
            break;
            case 4:
            Week="Wednesday";
            break;
            case 5:
            Week="Thursday";
            break;
            case 6:
            Week="Friday";
            break;
            case 7:
            Week="Saturday";
            default:
            Week="Nothing";
            System.out.println("Invalid week no.");
            break;
        }
        System.out.println("The weekday of "+choice+" is "+Week);
        sc.close();

    }
}
