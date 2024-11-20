public class Parameter{
    public static void main(String[] args) {
        
        System.out.println(sumTwoNumbers(4,7));
        System.out.println(sumTwoNumbers(10,222));
        System.out.println(sumTwoNumbers(-42212,1221));
        
    }


    public static int sumTwoNumbers(int first,int second ){
        System.out.println("first number recevied: " + first);
        System.out.println("second number recevied: " + second);
        int sum = first + second;
        return sum;

    }
}