import java.util.*;
public class biggest{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println(num1);
        }
        else if(num2>num1 && num2>num1)
        {
            System.out.println(num2);
        }
       else if(num3>num1 && num3>num1)
        {
            System.out.println(num3);
        }
        else {
            System.out.println("Tie..");
        }

    }
}