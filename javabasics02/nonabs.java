// Abstract class
abstract class Parent {
    // Abstract method
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method in the Parent class.");
    }
}

// Concrete subclass
class Child extends Parent {
    // Implementing abstract method
    void abstractMethod() {
        System.out.println("Abstract method implemented in the Child class.");
    }
}


public class nonabs {

    public static void main(String[] args) {
        Child child = new Child();
        child.abstractMethod(); // Calls the overridden abstract method
        child.nonAbstractMethod(); // Calls the non-abstract method from the parent class
    }    
}
