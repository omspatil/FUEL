package Homework;

import java.util.Scanner;

public class No_Check {
    public static void main(String[] args) {
        System.out.println("Enter a No: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.println(a+" is positive");
        }else if(a<0){
            System.out.println(a+" is negative");
        }else{
            System.out.println(a+" is zero");
        }
        sc.close();
    }
}
