import java.util.*;
import java.io.*;

public class Main {

  public static int guessNumber(int n) {
   int l = 1 ;
   int r = n ;
   while(l <= r)
   {
       int mid = (l+r)/2 ;
    //   System.out.println(mid);
       int p = guess(mid) ;
       if(p == 0 )
       {
           return mid ;
       }else if(p == 1)
       {
           l = mid  + 1 ;
       }else{
           r = mid - 1 ;
       }
   }
    return -1;
  }

  static int pn = 0; //picked number
  public static int guess(int val) {
    if (val == pn) {
      return 0;
    }
    else if (val < pn) {
      return 1;
    }
    else {
      return -1;
    }
  }

  public static void solve(int n, int pick) {
    pn = pick;
    System.out.println(guessNumber(n));
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int pick = scn.nextInt();

    solve(n, pick);
  }
}
