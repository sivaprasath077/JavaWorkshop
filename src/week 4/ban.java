import java.sql.SQLOutput;
import java.util.*;
abstract class BankAccoun{
    String AccountNum;
    int Balance;
    abstract void deposit(int amount);
    abstract void withdraw(int deposit);
    BankAccoun(String AccountNum,int Balance)
    {
        this.AccountNum=AccountNum;
        this.Balance=Balance;
    }
    abstract void display();
}
class Savings extends BankAccoun{
    int minb=500;
    Savings(String an,int n)
    {
        super(an,n);
    }
    void deposit(int amount)
    {
        Balance+=amount;
    }
    void withdraw(int withd)
    {
        if(Balance-withd>minb)
        {
            Balance=Balance-withd;
        }
        else{
            System.out.println("Insufficent Balance");
        }
    }
    void display(){
        System.out.println("This ur saving account balance "+Balance);
    }
}
    class Current extends BankAccoun{
        int minb=500;
        Current(String an,int n)
        {
            super(an,n);
        }
        void deposit(int amount)
        {
            Balance+=amount;
        }
        void withdraw(int withd)
        {
            int overd=200;
            if(Balance-withd>=overd)
            {
                Balance=Balance-withd;
            }
            else{
                System.out.println("Insuffict overDrift");
            }
        }
        void display(){
            System.out.println("This ur saving cuurent balance "+Balance);
        }



}
class ban{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Acc Num");
        String ac=s.nextLine();
        BankAccoun a=new Savings(ac,0);
        BankAccoun a1=new Current(ac,0);
        a.deposit(1000);
        a.withdraw(400);
        a1.deposit(500);
        a1.withdraw(400);
        a.display();
        a1.display();

    }
}