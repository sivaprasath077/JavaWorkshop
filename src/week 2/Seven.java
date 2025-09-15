import java.util.*;
public class Seven{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int tem=num;
        int sum=0;
        while(num!=0)
        {
            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }

        if(sum==tem)
        {
            System.out.print("Its a ArmStrong Number");
            return;
        }
        System.out.print("Its not a ArmStrong Number");
    }
}