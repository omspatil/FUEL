package If_else;
import java.util.Scanner;
public class seat {
    public static void main(String[] args) {
        System.out.println("Enter Balance: ");
        Scanner sc= new Scanner(System.in);
        int Balance= sc.nextInt();
        if(Balance>1000){
            System.out.println("Slipper");
        }
        else{
            System.out.println("lalpari");
        }
        sc.close();
    }
}
