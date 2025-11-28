
public class Gade {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Shubham");
        s.setAge(22);  // Valid age

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());

        s.setAge(-5);  // Invalid age (triggers validation)
    }
}
 







