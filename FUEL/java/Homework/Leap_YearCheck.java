package Homework;

import java.util.Scanner;

public class Leap_YearCheck {
    public static void main(String[] args) {
        System.out.println("Enter a Year: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a%400==0 || a%4==0 && a%100!=0){
            System.out.println("The year is leap year.");
        }else{
            System.out.println("Year is not a leap year.");
        }
        sc.close();

    }
}
