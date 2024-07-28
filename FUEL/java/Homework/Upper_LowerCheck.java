package Homework;

import java.util.Scanner;

public class Upper_LowerCheck {
        public static void main(String[] args) {
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(Character.isUpperCase(a)){
            System.out.println(a+" is Uppercase");
        }else{
            System.out.println(a+" is Lowercase");
        }
        sc.close();
        }
}
