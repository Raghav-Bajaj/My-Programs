import java.util.*;
import java.io.*;

public class Main {

  public static ArrayList<Integer>  leaders(int[]arr) {
     ArrayList<Integer> ans = new ArrayList<>();
     ans.add(arr[arr.length-1]);
    for(int i = arr.length -2 ; i >= 0 ; i--)
    {
        if(arr[i] >= arr[i+1])
        {
            ans.add(arr[i]);
        }
        arr[i] = Math.max(arr[i] , arr[i+1]);
    }
     Collections.reverse(ans);
    return ans ; 
  }

  public static void main(String[]args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    ArrayList<Integer>ans = leaders(arr);

    for (int val : ans) {
      System.out.print(val + " ");
    }
  }
}
