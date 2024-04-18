class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person original) {
        this.name = original.name;
        this.age = original.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class copycon2 {
    public static void main(String[] args) {
        // Creating a Person object using the constructor
        Person person1 = new Person("Alice", 30);

        // Creating a new Person object using the copy constructor
        Person person2 = new Person(person1);

        // Displaying the details of both objects
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        System.out.println("\nPerson 2 (copy of Person 1):");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }
}
