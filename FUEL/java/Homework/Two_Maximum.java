package Homework;

import java.util.Scanner;

public class Two_Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b){
            System.out.println(a+" is maximum");
        }else if(b>a){
            System.out.println(b+" is maximum");
        }else{
            System.out.println("Both Are equal");
        }
        sc.close();
    }
}
