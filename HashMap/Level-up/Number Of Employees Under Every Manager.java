import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    
    char[][] arr = new char[n][2];
     for(int i = 0 ; i < n ; i++)
    {
        char a = sc.next().charAt(0);
       char b = sc.next().charAt(0);
       arr[i][0] = a ;
       arr[i][1]  = b ;
    }
   HashMap<Character, HashSet<Character>> map = new HashMap<>();
   
   for(int i = 0 ; i < n ; i++)
   {
       char a = arr[i][0];
       char b = arr[i][1];
       if(a == b)
       {
           continue ;
       }
       if(map.containsKey(b))
       {
           if(map.containsKey(a))
           {
             HashSet<Character> set = map.get(a);
        
             for(char c : set)
             {
                  map.get(b).add(c);
             }
           }
               
           
           map.get(b).add(a);
       }else{
               map.put(b , new HashSet<>());
                if(map.containsKey(a))
           {
             HashSet<Character> set = map.get(a);
             for(char c : set)
             {
                  map.get(b).add(c);
             }
           }
               map.get(b).add(a);
       }
   
   }
     for(int i = 0 ; i < n ; i++)
     {
         if(map.containsKey(arr[i][0]))
         {
             System.out.println(arr[i][0] +" " + map.get(arr[i][0]).size());
         }else{
             System.out.println(arr[i][0] + " " + '0' ) ;
         }
     }
  }

}
