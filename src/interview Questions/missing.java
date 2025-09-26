import java.sql.SQLOutput;
import java.util.*;
public class missing{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++)
        {
            num[i]=s.nextInt();
        }
        for(int j=0;j<num.length;j++)
        {
            if(j+1!=num[j])
            {
                System.out.println(j+1);
                return;
            }
        }
    }
}