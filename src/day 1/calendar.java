import java.util.*;
public class calendar{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        if(year%400==0||(year%100!=0 && year%4==0))
        {
            System.out.println("Its a Leap Year");
        }
        else {
            System.out.println("Its not a Leap Year");
        }
    }
}
