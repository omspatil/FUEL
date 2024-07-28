package posttest;
//WAP on multiple inheritance where one child class aquires the properties of multiple superclasses where all the methods are same in parent class.

// Interface 1
interface Interface1 {
    default void display() {
        System.out.println("Display method from Interface1");
    }
}

// Interface 2
interface Interface2 {
    default void display() {
        System.out.println("Display method from Interface2");
    }
}

// Class implementing both interfaces
class MyClass implements Interface1, Interface2 {
    // Here, we need to explicitly provide an implementation for the display method to resolve the conflict
    @Override
    public void display() {
        // We can call the desired implementation from either interface using InterfaceName.super.methodName()
        Interface1.super.display(); // Or Interface2.super.display()
    }
}

public class three {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display(); // This will call the overridden display method in MyClass
    }
}
