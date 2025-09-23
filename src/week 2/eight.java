import java.util.*;
public class eight{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int rev=0;
        int temp=num;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("its is a Palindrome");
        }
        else {
            System.out.println("Its not a palindrome");
        }
    }
}