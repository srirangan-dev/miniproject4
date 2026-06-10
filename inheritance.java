import java.util.Scanner;
class person{
    String name;
    int age;
    
    void getpersondetails(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the name:");
        name =sc.nextLine();
        System.out.print("Enter the age:");
        age=sc.nextInt();
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class student extends person{
    int rollno;
    int m1,m2,m3;
    Scanner s =new Scanner(System.in);
    void getstudentdetail(){
    System.out.print("Enter the rollno:");
    rollno=s.nextInt();
    System.out.print("Enter the m1:");
    m1=s.nextInt();
    System.out.print("Enter the m2:");
    m2=s.nextInt();
    System.out.print("Enter the m3:");
    m3=s.nextInt();
    }
    double cavg(){
        return (m1+m2+m3)/3.0;
    }
    double cpersentage(){
        return ((m1+m2+m3)/300.0)*100;
    }
    void displays(){
        System.out.println("Rollno:"+rollno);
        System.out.println("M1: "+m1);
        System.out.println("M2: "+m2);
        System.out.println("M3: "+m3);
        System.out.println("Avg: "+cavg());
        System.out.println("Percentage: "+cpersentage());
    } 
}
public class Main{
    public static void main(String []args){
        student obj =new student();
        obj.getpersondetails();
        obj.getstudentdetail();
        obj.display();
        obj.displays();
        
        
    }
}
