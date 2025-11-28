
class Sum {
    void calSum(int... x) {
        int total = 0;
        for (int num : x) {
            total += num;
        }
        System.out.println("Sum = " + total);
    }
}

public class SumApplication {
    public static void main(String[] args) {
        Sum s = new Sum();

        s.calSum(10, 20);               
        s.calSum(1, 2, 3, 4, 5, 6);      
        s.calSum();                     
    }
}
