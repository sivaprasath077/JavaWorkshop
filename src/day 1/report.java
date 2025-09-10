import java.util.*;
public class report{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num>=90)
        {
            System.out.println("A");
        }
        else if(num>=75 && num<90)
        {
            System.out.println("B.");
        }
        else if(num>=50 && num<75)
        {
            System.out.println("c");
        }
        else {
            System.out.println("Fail");
        }
    }
}
