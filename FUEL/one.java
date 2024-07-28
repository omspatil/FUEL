import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double max = Math.max(num1, num2);
        System.out.println("Maximum between " + num1 + " and " + num2 + " is: " + max);
    }
}
