// Parent class
class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Parameterized constructor for Member
    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    void printSalary() {
        System.out.println("Salary: $" + salary);
    }
}

// Child class Employee inheriting from Member
class Employee extends Member {
    String specialization;

    // Parameterized constructor for Employee
    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

// Child class Manager inheriting from Member
class Manager extends Member {
    String department;

    // Parameterized constructor for Manager
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class demoMember {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("PADDA YOGESHWARA RAO", 30, "9440834411", "123 Main Street", 50000.0, "Software Development");
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);
        System.out.println();

        // Creating a Manager object
        Manager manager = new Manager("JaiFal", 35, "8456815695", "456 Park Avenue", 80000.0, "Impact Unboaund");
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}
