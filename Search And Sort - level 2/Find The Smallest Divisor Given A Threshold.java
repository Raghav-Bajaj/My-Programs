import java.util.*;
import java.io.*;

public class Main {
    public static int findSmallestDivisor(int[]nums,int th) {
      Arrays.sort(nums);
      if(nums.length == th)
      {
          return nums[nums.length -1] ;
      }
      int lo = 0 ;
      int hi = nums[nums.length -1] ;
      int speed = Integer.MAX_VALUE ;
      while(lo <= hi)
      {
          int mid = lo + (hi-lo)/2 ;
          int temp = 0 ;
          for(int i = 0 ; i < nums.length ; i++)
            {
                temp += (int)Math.ceil(nums[i]/(mid*1.0));
                
            }
            if(temp <= th)
            {
                speed = Math.min(temp , speed);
                hi = mid - 1 ;
            }else{
                lo = mid +1 ;
            }
      }
      return speed ;
    // Arrays.sort(piles);
    //   int lo = 0 ;
    //   int hi = piles[piles.length -1];
    //   if(h == piles.length)
    //   {
    //       return hi ;
    //   }
    //   int speed = Integer.MAX_VALUE ;
    //   while(lo <= hi)
    //   {
    //       int mid = lo + (hi -lo)/2 ;
    //       int temp  = 0 ;
    //       for(int i = 0 ; i < piles.length ; i++)
    //       {
    //           temp += (int)Math.ceil(piles[i]/(mid*1.0)) ;
    //       }
    //       if(temp <= h )
    //       {
    //           speed = Math.min(speed , mid ) ;
    //           hi = mid -1  ;
              
    //       }else{
    //       lo = mid + 1 ;
    //       }
    //   }
    //   return speed ;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        //input work
        int n = scn.nextInt();
        int[]nums = new int[n];

        for(int i=0 ; i < n ; i++) {
            nums[i] = scn.nextInt();
        }

        int th = scn.nextInt();

        int speed = findSmallestDivisor(nums,th);
        System.out.println(speed);
    }
}
