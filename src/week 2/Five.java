import java.util.*;
public class Five {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int rev=0;
        while(num!=0)
        {
          int rem=num%10;
          rev=rev*10+rem;
          num=num/10;
        }
        System.out.print(rev);
    }
}