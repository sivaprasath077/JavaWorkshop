import java.util.*;
public class robot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        if(num==1)
        {
            System.out.println(a+b);
        }
        else if(num==2)
        {
            System.out.println(a-b);
        }
        else if(num==3)
        {
            System.out.println(a*b);
        }
        else if(num==4)
        {
            System.out.println(a/b);
        }
    }
}


