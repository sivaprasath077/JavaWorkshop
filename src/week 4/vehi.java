import java.util.*;
abstract class vehicle {
    abstract void Start();

    abstract void Stop();

    abstract void display();

    char n;

    vehicle(char b) {
        this.n = b;
    }
}

 class Bikee extends vehicle {

     void Start() {
         if (n == 'f') {
             System.out.println("It can Start By Kicking or AutoMatic");
         }
     }

     void Stop() {
         if (n == 'f') {
             System.out.println("Its can Stop By Front Brake or Back Brake");
         }
     }
     void display()
     {
         if(n=='e')
         {
             System.out.println("No Fuel");
         }
     }

     Bikee(char n)
     {
         super(n);
     }
 }
 class carr extends vehicle{
         void Start ()
         {
             if(n=='f')
             System.out.println("It can Start By Key");
         }
         void Stop ()
         {
             if(n=='f')
             System.out.println("Its can Stop By Hand Brake");
         }
         void display()
         {
             if(n=='e')
             {
                 System.out.println("No Fuel");
             }
         }

     carr(char n)
     {
         super(n);
     }
 }
class vehi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        vehicle o=new Bikee(a);
        o=new carr(a);
        o.Start();
        o.Stop();
        o.display();
        o.Start();
        o.Stop();
        o.display();
    }

}