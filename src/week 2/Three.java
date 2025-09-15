import java.util.*;
public class Three{
public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={2,4,2,6,2,9,6};
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int num : a)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            list.add(num);
        }
        for(int num : list)
        {
            System.out.println( num +"its count is"+map.get(num));
        }
 }
}