import java.util.*;
public class bank{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num==0)
        {
            System.out.println("ZeroBalance.");
        }
        else if(num>0)
        {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}