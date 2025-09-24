
import java.util.*;
class Employee{
    private String name;
    private int salary;
    private int id;
    void getId(int id)
    {
        this.id=id;
    }
    void getName(String name)
    {
        this.name=name;
    }
    void getsalary(int salary)
    {
        this.salary=salary;
    }
    void display()
    {
        System.out.println("Your ID is"+id);
        System.out.println("Your Name is"+name);
        System.out.println("Your Salary is"+salary);
    }
}
class Fivee{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Id");
        int i=s.nextInt();
        s.nextLine();
        System.out.println("Enter your Name");
        String n=s.nextLine();
        System.out.println("Enter Your Salary");
        int sa=s.nextInt();
        Employee obj=new Employee();
        obj.getId(i);
        obj.getName(n);
        obj.getsalary(sa);
        obj.display();
    }
}