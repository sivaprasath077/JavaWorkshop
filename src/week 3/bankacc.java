import java.util.*;
class bankacc {
        int accnumber;
        double balance;
       void deposit(double a)
        {
            if(accnumber==1234) {
                balance += a;
                System.out.print(balance);
            }
            else {
                System.out.println("Invalid Accnumber");
            }
        }
        void withdraw(double a)
        {
            if(accnumber==1234) {
                balance -= a;
                System.out.println(balance);
            }
            else{
                System.out.println("Invalid Accnumber");
            }
        }
        bankacc(int num)
        {
            accnumber=num;
            balance=800;
        }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your AccountNumber");
        int num=s.nextInt();
        System.out.println("Enter 1 for depsit 2 for withdraw");
        int opt=s.nextInt();
        System.out.println("Enter your cash");
        int amount=s.nextInt();
        bankacc obj=new bankacc(num);
        if(opt==1)
        {
           obj.deposit(amount);
        }
        else {
            obj.withdraw(amount);
        }
    }
}