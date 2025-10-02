import java.util.*;
class Bookss{
    String Title;
    String Author;
    int price;
    Bookss(String Title,String Author,int price)
    {
        this.Title=Title;
        this.Author=Author;
        this.price=price;
    }
}
class TextBook extends Bookss{
    int Yop;
    TextBook(String a,String b,int c,int d)
    {
        super(a,b,c);
        Yop=d;
    }
    void display()
    {
        System.out.println(Title+" "+Author+" "+price+" "+Yop);
    }
}
class Magazine extends Bookss{
    int Yopp;
    Magazine(String q,String w,int e,int r)
    {
        super(q,w,e);
        Yopp=r;
    }
    void display()
    {
        System.out.println(Title+" "+Author+" "+price+" "+Yopp);
    }
}

class inher{
    public static void main(String[] args) {
        TextBook o=new TextBook("OnePIEce","oda",500,2004);
        Magazine n=new Magazine("Naruto","Lord",450,2002);
        o.display();
        n.display();
    }
}