package posttest;
//WAP to achieve 70% abstraction with abstraction concept.


abstract class Shape { 
    // Abstract method to calculate area
    abstract double calculateArea();
    
    // Abstract method to calculate perimeter
    abstract double calculatePerimeter();
}

// Concrete subclass representing a Circle
class Circle extends Shape {
    // Radius of the circle
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method to calculate area
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Implementation of abstract method to calculate perimeter
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete subclass representing a Rectangle
class Rectangle extends Shape {
    // Width and height of the rectangle
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementation of abstract method to calculate area
    @Override
    double calculateArea() {
        return width * height;
    }
    
    // Implementation of abstract method to calculate perimeter
    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class four {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        
        // Calculating area and perimeter of Circle
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        
        // Calculating area and perimeter of Rectangle
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
