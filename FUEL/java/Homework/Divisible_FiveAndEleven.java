package Homework;
import java.util.Scanner;

public class Divisible_FiveAndEleven {
    public static void main(String[] args) {
        System.out.println("Enter a No: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println(a+" is divisible by 5 and 11");
        }else{
            System.out.println(a+" is not divisible by 5 and 11");
        }
        sc.close();
    }
}