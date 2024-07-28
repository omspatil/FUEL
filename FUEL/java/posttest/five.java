package posttest;
//WAP to achieve the student result depends on the marks and give output in GRADE pattern but you should take input from the user.

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained (out of 100):");
        int marks = scanner.nextInt();

        char grade = calculateGrade(marks);
        
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static char calculateGrade(int marks) {
        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else if (marks >= 50) {
            grade = 'E';
        } else {
            grade = 'F'; // Failed
        }

        return grade;
    }
}
