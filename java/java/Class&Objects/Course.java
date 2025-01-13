public class Course {
    static int maxCapacity = 100; // Maximum capacity of the course
    String courseName;           // Name of the course
    int enrollments;             // Number of currently enrolled students
    String[] enrolledStudents;   // Array to store names of enrolled students

    // Constructor to initialize the course
    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    // Static method to set the maximum capacity for all courses
    static void setMaxCapacity(int newMaxCapacity) {
        maxCapacity = newMaxCapacity; // Correctly update the static field
    }

    // Method to enroll a student
    void enrollStudent(String studentName) {
        if (enrollments >= maxCapacity) {
            System.out.println("Cannot enroll student: Maximum capacity reached!");
        } else {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
            System.out.println("Student " + studentName + " enrolled successfully.");
        }
    }

    // Method to unenroll a student
    void unenrollStudent(String studentName) {
        boolean studentFound = false;
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                // Remove the student by shifting subsequent students left
                for (int j = i; j < enrollments - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[enrollments - 1] = null; // Clear the last slot
                enrollments--;
                studentFound = true;
                System.out.println("Student " + studentName + " removed successfully.");
                break;
            }
        }
        if (!studentFound) {
            System.out.println("Student " + studentName + " not found in the course.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Course javaCourse = new Course("Java Programming");

        // Enroll students
        javaCourse.enrollStudent("Alice");
        javaCourse.enrollStudent("Bob");
        javaCourse.enrollStudent("Charlie");

        // Try to unenroll a student
        javaCourse.unenrollStudent("Bob");
        javaCourse.unenrollStudent("David"); // Student not in the list

        // Check enrollments
        System.out.println("Current enrollments: " + javaCourse.enrollments);
    }
}
