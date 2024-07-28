package Problems;
/* Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F

 */

 import java.util.Scanner;

class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.println("Enter marks of five subjects:");
         System.out.print("Physics: ");
         double physics = scanner.nextDouble();
         System.out.print("Chemistry: ");
         double chemistry = scanner.nextDouble();
         System.out.print("Biology: ");
         double biology = scanner.nextDouble();
         System.out.print("Mathematics: ");
         double mathematics = scanner.nextDouble();
         System.out.print("Computer: ");
         double computer = scanner.nextDouble();
 
         double totalMarks = physics + chemistry + biology + mathematics + computer;
         double percentage = (totalMarks / 500) * 100;
 
         System.out.println("Percentage: " + percentage + "%");
 
         char grade;
 
         if (percentage >= 90) {
             grade = 'A';
         } else if (percentage >= 80) {
             grade = 'B';
         } else if (percentage >= 70) {
             grade = 'C';
         } else if (percentage >= 60) {
             grade = 'D';
         } else if (percentage >= 40) {
             grade = 'E';
         } else {
             grade = 'F';
         }
 
         System.out.println("Grade: " + grade);
     }
 }
 