class Mobile{
    String brand;
    int price;
    String name;
    
    void show(){
        System.out.println(brand + ": "+ price +": "+ name);
    }
}
public class MobileApp{
    public static void main(String[] args) {
      Mobile obj = new Mobile();
      obj.brand="Apple";
      obj.price=150000;
      obj.name="iphone 17 pro max";  
      obj.show();

      Mobile obj1 = new Mobile();
      obj1.brand="Samsung";
      obj1.price=145000;
      obj1.name="Samsung galaxy s25 ultra";
      obj1.show();

      Mobile obj2 = new Mobile();
      obj2.brand="Motorola";
      obj2.price=14500;
      obj2.name="edge 60+ ";
      obj2.show();


    }
}