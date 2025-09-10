import java.util.*;
public class robot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        if(num1==1)
        {
            System.out.println(a+b);
        }
        else if(num1==2)
        {
            System.out.println(a-b);
        }
        else if(num1==3)
        {
            System.out.println(a*b);
        }
        else if(num1==4)
        {
            System.out.println(a/b);
        }
    }
}


