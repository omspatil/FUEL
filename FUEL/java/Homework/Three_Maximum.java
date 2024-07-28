package Homework;

import java.util.Scanner;

public class Three_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three no: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("Maximum no :"+a);
        }else if(b>=a && b>=c){
            System.out.println("Maximum no :"+b);
        }else{
            System.out.println("Maximum no :"+c);
        }
        sc.close();
    }
}
