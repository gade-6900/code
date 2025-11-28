class sub{
    public int sub(int ...n){
        int sub=n[0];
        for(int i=1;i<n.length;i++){
            sub = sub-n[i];
        }
        return sub;
    }
}
public class Subtraction{
    public static void main(String args[]){
        sub obj= new sub();
        System.out.println(obj.sub(400 , 100));
    }
}