import java.sql.SQLOutput;
import java.util.*;
public class runner{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b)
        {
            System.out.println("Varun is Faster.");
        }
        else if(b>a)
        {
            System.out.println("Arjun is Faster");
        }
        else {
            System.out.println("Both Are Tie");
        }
    }
}