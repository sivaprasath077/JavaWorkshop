import java.util.*;
public class maxsub{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if (a[i]+currsum<a[i])
            {
                currsum=a[i];
            }
            else
            {
                currsum=currsum+a[i];
            }
            max=Math.max(max,currsum);
        }
        System.out.print(max);


    }
}