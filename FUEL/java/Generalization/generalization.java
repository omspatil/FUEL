package Generalization;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    public void eat() {
        System.out.println("The animal eats its food.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("The cat meows.");
    }
}

public class generalization {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", 5);
        Cat cat = new Cat("Whiskers", 3);

        dog.makeSound();
        cat.makeSound();

        dog.bark();
        cat.meow();
    }
}
