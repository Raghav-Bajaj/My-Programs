import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
        Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];
   for(int i = 0 ; i < n ; i++)
   {
       arr[i] = sc.nextInt();
   }
    int m = sc.nextInt();
   int[] str = new int[m];
   for(int i = 0 ; i < m ; i++)
   {
       str[i] = sc.nextInt();
   }
   HashMap<Integer,Integer> map = new HashMap<>();
   for(int val : arr)
   {
       if(map.containsKey(val))
       {
           int ol = map.get(val);
           map.put(val,ol+1);
       }else{
           map.put(val,1);
       }
       
   }
   for(int an : str)
   {
       if(map.get(an) != null && map.get(an) > 0)
       {
           System.out.println(an);
           map.put(an,map.get(an)-1);
       }
   }

 }

}
