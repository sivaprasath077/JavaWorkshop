import java.util.*;
public class ten{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*"+"");
            }
            for(int m=1;m<i;m++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}