import java.util.*;
abstract class employee {
    abstract void getBonus();
}
    class manager extends employee{
        void getBonus(){
            System.out.println("YOur Bounus is 2%");
        }
    }
    class developer extends employee{
        void getBonus(){
            System.out.println("YOur Bounus is 10%");
        }
    }
class poly2{
    public static void main(String[] args) {
        employee a=new manager();
        employee b=new developer();
        a.getBonus();
        b.getBonus();
    }
}