import java.util.Scanner;

class TopperMarksCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of the Student:");
        int topperMarks = scanner.nextInt();

        if (topperMarks <= 90) {
            System.out.println("The Student is not Topper.");
        } else {
            System.out.println("The Student is Topper.");
        }

        scanner.close();
    }
}
