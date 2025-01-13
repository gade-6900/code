import java.util.ArrayList;
import java.util.Scanner;

// Class to store student information
class Student {
    private String name;
    private int marks;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.marks = -1; // Marks are initially unset (-1 indicates no marks assigned)
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    // Getter and Setter for marks
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class Students{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Welcome to the Student Marks Manager!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Student");
            System.out.println("2. Assign Marks");
            System.out.println("3. Display All Students and Marks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Add a student
                    System.out.print("Enter the name of the student: ");
                    String name = scanner.nextLine();
                    students.add(new Student(name));
                    System.out.println("Student " + name + " has been added.");
                    break;

                case 2:
                    // Assign marks to a student
                    if (students.isEmpty()) {
                        System.out.println("No students in the class. Please add students first.");
                        break;
                    }

                    System.out.println("Student List:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println((i + 1) + ". " + students.get(i).getName());
                    }

                    System.out.print("Enter the number corresponding to the student: ");
                    int studentIndex = scanner.nextInt() - 1;

                    if (studentIndex < 0 || studentIndex >= students.size()) {
                        System.out.println("Invalid student number.");
                        break;
                    }

                    System.out.print("Enter marks for " + students.get(studentIndex).getName() + ": ");
                    int marks = scanner.nextInt();
                    students.get(studentIndex).setMarks(marks);
                    System.out.println("Marks assigned successfully.");
                    break;

                case 3:
                    // Display all students and marks
                    if (students.isEmpty()) {
                        System.out.println("No students in the class.");
                    } else {
                        System.out.println("\nStudent List with Marks:");
                        for (Student student : students) {
                            String marksDisplay = (student.getMarks() == -1) ? "Not Assigned" : String.valueOf(student.getMarks());
                            System.out.println("Name: " + student.getName() + ", Marks: " + marksDisplay);
                        }
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the Student Marks Manager. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
