public class RecursionExample{
  public static int factorial(int n){
    
    if(n == 0 ){
      return 1;
      
    }else {
      retrun n * factorial(n-1);//recursive call
      
    }
  }
   public static void main(String[]args){
     int number = 5;
     System.out.println("factorialof " + number +"is:" factorial(number));
     
   }



  
}
