
import java.util.*;
class three{
    String title;
    String author;
    int prize;
    public three(){
        title="Unknown";
        author="Unknown";
        prize=0;
    }
    public three(String title,String author){
        this.title=title;
        this.author=author;
    }
    void display()
    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(prize);
    }
    public static void main(String[] args)
    {
        three obj=new three("Way to Glory","Luffy");
        three obj2=new three();
        obj.display();
        System.out.println("");
        obj2.display();
    }
}