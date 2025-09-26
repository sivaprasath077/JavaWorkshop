import java.util.*;
public class sort{
    public static void main(String[] args) {
        int a[]={6,0,2,1,2,0,1};
        int temp;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a) );
    }
}