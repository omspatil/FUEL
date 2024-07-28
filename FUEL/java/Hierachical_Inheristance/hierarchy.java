package Hierachical_Inheristance;
class Vehicle {
    protected String brand;

    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String brand, int numberOfSeats) {
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
    }

    public void drive() {
        System.out.println("Car is being driven.");
    }

    public void honk() {
        System.out.println("Car is honking.");
    }
}

class Bicycle extends Vehicle {
    private int numberOfGears;

    public Bicycle(String brand, int numberOfGears) {
        this.brand = brand;
        this.numberOfGears = numberOfGears;
    }

    public void ride() {
        System.out.println("Bicycle is being ridden.");
    }
}

public class hierarchy {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 5);
        Bicycle myBicycle = new Bicycle("Giant", 21);

        myCar.drive();
        myCar.honk();

        myBicycle.drive();
        myBicycle.ride();
    }
}
