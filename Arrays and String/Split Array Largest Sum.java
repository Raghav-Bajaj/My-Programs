import java.util.*;
import java.io.*;

public class Main {

  public static int splitArray(int[]arr, int m) {
  int lo = 0 ;
   int hi = 0 ;
   for(int i = 0 ; i  < arr.length ; i++)
   {
       hi += arr[i] ;
       lo = Math.max(lo,arr[i]);
   }
   if(m == 1)
        return hi ;
    if(m == arr.length)
        return lo ;
    int res = Integer.MAX_VALUE ;
    while(lo <= hi)
    {
        int mid = lo +(hi-lo)/2 ;
        int count = 1;
        int temp = 0 ;
        for(int i = 0 ; i  < arr.length ; i++)
       {
               temp += arr[i] ;
               if(temp > mid)
               {
                   count++ ;
                   temp = arr[i];
               }
        }
        if(count <= m)
        {
            res = Math.min(res,mid);
            hi = mid -1 ;
        }else{
            lo = mid+1 ;
        }
        
    }
    return res;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int m = scn.nextInt();

    int ans = splitArray(arr, m);
    System.out.println(ans);
  }
}
