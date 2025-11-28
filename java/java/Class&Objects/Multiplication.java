class mul{
    public int mul(int ...n){
        int mul=1;
        for(int i : n){
        mul= mul*i;
      }
    return mul;
    }
}
public class Multiplication{
    public static void main(String args[]){
        mul obj= new mul();
        System.out.println(obj.mul(20,20));
    }
}