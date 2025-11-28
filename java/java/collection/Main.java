import java.util.ArrayList;
public class Main{
    public static void main(String []args){
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("1");
        cars.add("2");
        cars.add("2");
        cars.add("2");
        cars.add("2");
        cars.add("2");
        cars.add("2");

        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
    }
}