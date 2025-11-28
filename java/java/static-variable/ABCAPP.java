class ABC{
    static int y=100;
    int z=200;
}
public class ABCAPP{
    public static void main(String[] args) {
        System.out.println("y = "+  ABC.y);
        System.out.println("z = "+ new ABC().z);
    }
}