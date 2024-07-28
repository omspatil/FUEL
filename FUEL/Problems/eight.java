package Problems;
//Write a program to input any alphabet and check whether it is vowel or consonant

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);

        // Convert the input character to lowercase for simplicity
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel or a consonant
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }

    public static boolean isVowel(char ch) {
        // Check if the character is one of the vowels: a, e, i, o, u
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
