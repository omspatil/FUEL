package Homework;
import java.util.Scanner;
public class Even_OddCheck {
    public static void main(String[] args) {
        System.out.print("Enter a no: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0 && a!=0){
            System.out.println("The "+a+" is even.");
        }else if(a%2!=0 && a!=0){
            System.out.println("The "+a+" is odd");
        }else{
            System.out.println("The "+a+" is neither even nor odd");
        }
        sc.close();
    }
}
