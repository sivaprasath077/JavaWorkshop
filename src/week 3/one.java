
import java.util.*;
class Rectangle{
    public void area(int l,int b)
    {
        System.out.println(l*b);
    }
    public void perimeter(int l,int b)
    {
        System.out.println(2*(l+b));
    }
}
public class one {
    public static void main(String[] args){
        Rectangle s1=new Rectangle();
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        s1.area(a,b);
        s1.perimeter(a,b);


    }
}