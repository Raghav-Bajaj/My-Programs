import java.util.*;
import java.io.*;

public class Main {

  public static int findTransition(int[]arr) {
    int l = 0 ;
    int r = arr.length -1 ;
    int ans = -1 ; 
    while(l <= r)
    {
        int mid = (l+r)/2;
        if(arr[mid] == 1)
        {
         ans = mid ;
         r = mid - 1 ;
         
        }else{
            l = mid+1 ;
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

    System.out.println(findTransition(arr));
  }
}
