class Rectangle {
    private int length;
    private int breadth;

    // Default constructor
    public Rectangle() {
        this.length = 10;
        this.breadth = 10;
    }

    // Parameterized constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Getter for length
    public int getLength() {
        return this.length;
    }

    // Getter for breadth
    public int getBreadth() {
        return this.breadth;
    }
}

public class AbstractRectangle {
    public static void main(String[] args) {
        // Creating a rectangle using default constructor
        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Default Rectangle: Length = " + defaultRectangle.getLength() + ", Breadth = " + defaultRectangle.getBreadth());

        // Creating a rectangle using parameterized constructor
        Rectangle customRectangle = new Rectangle(20, 30);
        System.out.println("Custom Rectangle: Length = " + customRectangle.getLength() + ", Breadth = " + customRectangle.getBreadth());
    }
}
