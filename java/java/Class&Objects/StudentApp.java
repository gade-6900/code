import java.util.*;
class Student{
    int [] marks;
    float  Percentage;
public void setSubMarks(int s[]){
    marks=s;
}
void calculatePer(){
   int total = 0;
        for (int mark : marks) {
            total += mark;
    }
    Percentage = (float)total / marks.length;

}
void checkGrade(){
    System.out.println("percentage : "+ Percentage +" % ");
    if(Percentage>75&& Percentage<=100){
        System.out.println("Grade : A");
    }else if(Percentage>60 && Percentage<=75){
        System.out.println("Grade : B");
    }else if(Percentage>50 && Percentage<=60){
        System.out.println("Grade : C");
    }else if(Percentage>40 && Percentage<=50){
        System.out.println("Grade : D");
    }else if(Percentage >40){
        System.out.println("Your are fail");
    }else{
        System.out.println("enter valid marks: ");
    }


}
}
public class StudentApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] SubjectMarks = new int[6];
        System.out.println("enter marks of student:");

       
        for(int i=0;i<6;i++){
             System.out.print("Subject " + (i + 1) + ": ");
             SubjectMarks [i]= sc.nextInt();
             
        }
                Student student = new Student();
        student.setSubMarks(SubjectMarks);
        student.calculatePer();
        student.checkGrade();





    }
}