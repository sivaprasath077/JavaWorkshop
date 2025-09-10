import java.util.*;
public class bulb{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num%2==0)
        {
            System.out.println("Ligth is On.");
        }
        else {
            System.out.println("Ligth is Off");
        }
    }
}