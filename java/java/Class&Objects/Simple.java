class Cla{
    public int add(int ...n){
       
        int sum=0;
        for(int i : n ){
            sum= sum+i;
        }
        return sum;
    }
 }
 public class Simple{
    public static void main( String args[]){
        Cla obj= new Cla();
        System.out.println(obj.add(4,5,6,7,8,9,10));
    }
 }