package posttest;
//WAP on generalization with the help of abstract class concept.

abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void start();

    public abstract void stop();

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}

public class eight {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla");
        car.displayInfo();
        car.start();
        car.stop();
        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Honda", "CBR");
        motorcycle.displayInfo();
        motorcycle.start();
        motorcycle.stop();
    }
}
