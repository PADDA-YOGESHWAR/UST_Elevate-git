import java.util.Scanner;

public class StudentGradesTracker {
    public static void main(String[] args) {
        // Declare an array to store student grades
        int[] grades;
        int numStudents;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();

        // Initialize the array with the number of students
        grades = new int[numStudents];

        // Input grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Display all grades entered
        System.out.println("Grades entered:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }

        // Calculate the average grade
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;

        // Display the average grade
        System.out.println("Average Grade: " + average);
    }
}
