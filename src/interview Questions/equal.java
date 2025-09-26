import java.util.*;
public class equal{
    public static void main(String[] args) {
       int k=0;
       int a[]={0,0,0,0};
       int count=0;
       int sum=0;
       for(int i=0;i<a.length;i++)
       {
             sum=0;
           for(int j=i;j<a.length;j++)
           {
               sum+=a[j];
               if(sum==k)
               {
                   count++;
               }
           }
       }
       System.out.print(count );
    }
}