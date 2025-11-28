import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        float r = sc.nextFloat();
        
        float PI = 3.14f;
        float diameter = 2 * r;
        float circumference = 2 * PI * r;
        float area = PI * r * r;

        System.out.println("Diameter is: " + diameter);
        System.out.println("Circumference is: " + circumference);
        System.out.println("Area of the circle is: " + area);
        
        sc.close();
    }
}
