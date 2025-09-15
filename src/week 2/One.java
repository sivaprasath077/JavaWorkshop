import java.util.Scanner;
public class One {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[7];
        int p=0;
        int n=0;
        int zero=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
            if(arr[i]>0)
            {
                p++;
            }
            else if(arr[i]<0)
            {
                n++;
            }
            else {
                zero++;
            }
        }
        System.out.print(p+" "+n+" "+zero);
    }
}