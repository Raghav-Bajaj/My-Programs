import java.util.*;
import java.io.*;

public class Main {
    public static int minEatingSpeed(int[]piles,int h) {
      Arrays.sort(piles);
      int lo = 0 ;
      int hi = piles[piles.length -1];
      if(h == piles.length)
      {
          return hi ;
      }
      int speed = Integer.MAX_VALUE ;
      while(lo <= hi)
      {
          int mid = lo + (hi -lo)/2 ;
          int temp  = 0 ;
          for(int i = 0 ; i < piles.length ; i++)
          {
               temp += (piles[i]/mid ) ;
               if(piles[i]%mid != 0 )
               {
                   temp++ ;
               }
          }
          if(temp <= h )
          {
              speed = Math.min(speed , mid ) ;
              hi = mid -1  ;
              
          }else{
           lo = mid + 1 ;
          }
      }
      return speed ;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        //input work
        int n = scn.nextInt();
        int[]piles = new int[n];

        for(int i=0 ; i < n ; i++) {
            piles[i] = scn.nextInt();
        }

        int h = scn.nextInt();

        int speed = minEatingSpeed(piles,h);
        System.out.println(speed);
    }
}
