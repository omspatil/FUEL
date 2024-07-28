package posttest;
//Write a program on constructor chaining to define a student details with respect to student name, student roll, student year, student stream and Student Percenetage with student subject name and also revoke the constructor in proper manner.

import java.util.ArrayList;

class Student {
    private String name;
    private int rollNumber;
    private int year;
    private String stream;
    private double percentage;
    private ArrayList<String> subjects;

    // Constructor with name, rollNumber, year, and stream
    public Student(String name, int rollNumber, int year, String stream) {
        this(name, rollNumber, year, stream, 0.0, new ArrayList<String>());
    }

    // Constructor with name, rollNumber, year, stream, and percentage
    public Student(String name, int rollNumber, int year, String stream, double percentage) {
        this(name, rollNumber, year, stream, percentage, new ArrayList<String>());
    }

    // Constructor with all details including subjects
    public Student(String name, int rollNumber, int year, String stream, double percentage,
            ArrayList<String> subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.year = year;
        this.stream = stream;
        this.percentage = percentage;
        this.subjects = subjects;
    }

    // Method to add subject
    public void addSubject(String subject) {
        subjects.add(subject);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Year: " + year);
        System.out.println("Stream: " + stream);
        System.out.println("Percentage: " + percentage);
        System.out.println("Subjects: ");
        for (String subject : subjects) {
            System.out.println("- " + subject);
        }
    }
}

public class two {
    public static void main(String[] args) {
        // Creating a student object using different constructors
        Student student1 = new Student("John Doe", 101, 2023, "Science");
        // Adding subjects for student1
        student1.addSubject("Physics");
        student1.addSubject("Chemistry");
        student1.addSubject("Mathematics");

        // Displaying student details
        System.out.println("Student 1 Details:");
        student1.displayDetails();

    }
}
