import java.util.*;
import java.io.*;

public class Main {

  public static int firstBadVersion(int n) {
    int  l = 1 ; 
    int r = n ;
    int ans = -1 ;
    while(l <= r)
    {
        int mid = (l+r)/2 ;
        if(isBadVersion(mid) == true )
        {
            ans = mid ;
            r = mid -1;
        }else{
            l = mid +1 ;
        }
    }
    return ans;
  }

  static int bad = 0;
  public static boolean isBadVersion(int val) {
    if (val >= bad) {
      return true;
    }
    else {
      return false;
    }
  }

  public static void solve(int n, int fbv) {
    bad = fbv;
    System.out.println(firstBadVersion(n));
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int fbv = scn.nextInt();

    solve(n, fbv);
  }
}
