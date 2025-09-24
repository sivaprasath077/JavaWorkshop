
import java.util.*;
class Rectangle{
    int l;
    int b;
    public void area()
    {
        System.out.println(l*b);
    }
    public void perimeter()
    {
        System.out.println(2*(l+b));
    }
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
}
public class Rect{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Length");
        int length=s.nextInt();
        System.out.println("Enter your breadth");
        int breadth=s.nextInt();
        Rectangle s1=new Rectangle(length,breadth);
        s1.area();
        s1.perimeter();
    }
}