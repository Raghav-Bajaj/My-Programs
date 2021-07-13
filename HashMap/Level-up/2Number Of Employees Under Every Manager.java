import java.io.*;
import java.util.*;

public class Main {
    public static void find(HashMap<String , String > map)
    {
        HashMap<String,HashSet<String>> tree = new HashMap<>();
        String ceo = "";
        for(String emp : map.keySet())
        {
            String man = map.get(emp);
            if(emp.equals(man))
            {
                ceo = man ;
            }else{
                if(tree.containsKey(man))
                {
                    
                    tree.get(man).add(emp);
                }else{
                  
                    tree.put(man , new HashSet<>());
                    tree.get(man).add(emp);
                    
                }
            }
        }
        HashMap<String , Integer > res = new HashMap<>();
        getSize(tree , ceo , res);
        for(String s  : res.keySet())
        {
            System.out.println(s + " " + res.get(s).toString());
        }
        
    }
    public static int getSize( HashMap<String,HashSet<String>> tree  , String man ,HashMap<String , Integer > res)
    {
        if(tree.containsKey(man) == false)
        {
            res.put(man , 0);
            return 1 ;
        }
        int sz = 0 ;
        for(String s : tree.get(man))
        {
            int cs = getSize(tree , s , res);
            sz += cs ;
            
        }
   
        res.put(man , sz);
        
        return sz + 1 ;
    }
    
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    HashMap<String ,String > map = new HashMap<>();
    for(int i = 0 ; i  < n ; i++)
    {
        map.put(sc.next() , sc.next());
    }
    find(map);
  }

}
