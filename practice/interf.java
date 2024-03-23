// Interface
interface MyInterface {
    // Abstract method
    void abstractMethod();
}

// Concrete class implementing the interface
class MyClass implements MyInterface {
    // Implementing abstract method
    public void abstractMethod() {
        System.out.println("Abstract method implemented in MyClass.");
    }

    // Additional methods if needed
    void anotherMethod() {
        System.out.println("Another method in MyClass.");
    }
}

public class interf {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.abstractMethod(); // Calls the implemented abstract method
        obj.anotherMethod(); // Calls the additional method in MyClass
    }
}
