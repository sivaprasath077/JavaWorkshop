import java.util.*;
class Student{
    String name;
    int rollno;
    int marks;
    Scanner s=new Scanner(System.in);
    public void display(){
        name=s.nextLine();
        rollno=s.nextInt();
        marks=s.nextInt();
        System.out.println(name+" "+rollno+" "+marks);
    }

}
public class two{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.display();
        s2.display();
        s3.display();

    }
}