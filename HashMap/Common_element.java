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
    Set<Integer> set = new HashSet<>();
    for(int i = 0 ; i < arr.length ; i++)
    {
        set.add(arr[i]);
    }
    for(int i = 0 ; i < str.length ; i++)
    {
        if(set.contains(str[i]))
        {
            System.out.println(str[i]);
            set.remove(str[i]);
        }
    }
 }

}
