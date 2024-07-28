package Homework;

import java.util.Scanner;

public class Character_Check {
    public static void main(String[] args) {
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(Character.isLetter(a)){
            System.out.println(a+" is alphabet");
        }else if(Character.isDigit(a)){
            System.out.println(a+" is digit");
        }else{
            System.out.println("neither alphabet nor digit");
        }
        sc.close();
        }

    }

