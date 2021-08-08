import java.util.*;
import java.io.*;

public class Main {

  public static int shipWithinDays(int[]arr, int days) {
      int lo = 0 ;
      int hi = 0 ;
   for(int i = 0 ; i < arr.length ; i++)
   {
       lo = Math.max(lo,arr[i]);
       hi += arr[i] ;
   }
   if(days == arr.length)
    return lo ;
    if(days == 1)
        return hi ;
    int ans = Integer.MAX_VALUE ;
    while(lo <= hi)
    {
        int mid = lo + (hi-lo)/2 ;
        int count = 1 ;
        int temp = 0 ;
         for(int i = 0 ; i < arr.length ; i++)
         {
             temp += arr[i] ;
             if(temp > mid)
             {
                 count++ ;
                 temp = arr[i] ;
             }
         }
         if(count <= days)
         {
             ans = Math.min(ans , mid);
             hi = mid -1 ;
         }else{
             lo = mid +1 ;
         }
    }
    return ans;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int days = scn.nextInt();

    int ans = shipWithinDays(arr, days);
    System.out.println(ans);
  }
}
