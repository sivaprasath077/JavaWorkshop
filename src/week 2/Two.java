import java.util.*;
public class Two{
    public static void main(String[] args)
    {
        int max=0;
        int max2=0;
        int a[]={14,28,19,33,45,12};
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==max){
                continue;
            }
            max2=Math.max(max2,a[i]);
        }
        System.out.print(max+" "+ max2);
    }
}