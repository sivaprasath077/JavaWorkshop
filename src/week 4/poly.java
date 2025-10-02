import java.util.*;
abstract class shape{
    abstract double area();
}
class circle extends shape {
    double radius;
    circle(double num)
    {
        radius=num;
    }
     double area() {
          return  Math.PI*radius*radius;
    }
}
class  Rec extends  shape{
    double l;double b;
    Rec(double length,double bre)
    {
        l=length;
        b=bre;

    }
     double area(){
            return l*b;
    }

}
class Triangle extends shape{
    double base,heigth;
     Triangle(double b,double h){
            base=b;
            heigth=h;
    }
    double area()
    {
        return 0.5*base*heigth;
    }

}
public class poly{
    public static void main(String[] args) {
        shape[] shapes={ new circle(5),
                new Rec(10,20),
                new Triangle(3,7)
        };
        for(shape s : shapes)
        {
            System.out.println(s.area());
        }
    }
}