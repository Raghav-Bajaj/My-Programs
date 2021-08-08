import java.util.*;
import java.io.*;

public class Main {
  public static int countPairs(int[]arr) {
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      
    for(int val : arr)
    {
        map.put(val,map.getOrDefault(val,0)+1);
    }
    int count = 0 ;
    for(int val : map.keySet())
    {
        count += sum(map.get(val)); 
    }
    return count ;
  }
  public static int sum(int n)
  {
      
      int s = ((n-1)*(n))/2 ;
      return s ;
      
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println(countPairs(arr));
  }
}
