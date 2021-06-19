import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
          Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];
   for(int i = 0 ; i < n ; i++)
   {
       arr[i] = sc.nextInt();
   }
   HashMap<Integer,Boolean> map = new HashMap<>();
   for(int val : arr)
   {
       map.put(val,true);
   }
   for(Integer vv : map.keySet())
   {
       if(map.containsKey(vv-1))
       {
           map.put(vv,false);
       }
   }
   int max = 0 ;
   int start = 0 ;
     for(Integer vv : map.keySet())
   {
    
       if(map.get(vv) == true){
              int temp = vv ; 
       int length = 1 ;
            while(map.containsKey(temp+length))
       {
           length++ ;
       }
       if(length > max)
       {
           max = length ;
           start = vv ;
       }
       }
     
   }
   for(int i = 0 ; i < max ; i++)
   {
       System.out.println(start +i);
   }
   
 }

}
