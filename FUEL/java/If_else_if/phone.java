package If_else_if;
import java.util.Scanner;
public class phone {
    public static void main(String[] args) {
        System.out.println("How much money do you have?");
        Scanner sc= new Scanner(System.in);
        int money=sc.nextInt();
        if(money>=100000){
            System.out.println("Habibi, buy Iphone");
        }
        else if(money>=80000 && money < 100000){
            System.out.println("Habibi, buy Samsung");
        }
        else if(money>=60000 && money<80000){
            System.out.println("Habibi, buy Oneplus");
        }
        else if(money>=40000 && money<60000){
            System.out.println("Habibi, buy Redmi");
        }
        else if(money>=20000 && money<40000){
            System.out.println("Habibi, buy normal Andriod");
        }
        else if(money>=10000 && money<20000){
            System.out.println("Habibi, buy Keyword phone");
        }
        else{
            System.out.println("Habibi, go back");
        }
        sc.close();
    }
}
