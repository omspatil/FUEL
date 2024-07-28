package Homework;

import java.util.Scanner;

public class Vowel_ConsonantCheck {
    public static void main(String[] args) {
        System.out.println("Enter a alphabet: ");
        Scanner sc =new Scanner (System.in);
        char a = sc.next().charAt(0);
        if(Character.isLetter(a)){
            if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                System.out.println(a+" is Vowel");
            }else{
                System.out.println(a+" is consonants.");
            }
        }else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
