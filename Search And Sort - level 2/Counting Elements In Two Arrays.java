import java.util.*;
import java.io.*;

public class Main {

  public static int[] find(int[]arr1, int[]arr2) {
    int m1 = 0 ;
    int m2 = 0 ;
    for(int val : arr1)
    {
        m1 = Math.max(m1 , val);
    }
    for(int val : arr2)
    {
        m2 = Math.max(m2 , val);
    }
    int len = Math.max(m1,m2);
    int[] nums = new int[len+1];
    for(int i = 0 ; i < arr2.length ; i++)
    {
        nums[arr2[i]]++ ;
    }
    int[] psum = new int[len+1];
    psum[0] = nums[0] ;
    for(int i = 1 ; i < nums.length ; i++)
    {
        psum[i] = nums[i] + psum[i-1] ;
    }
    for(int i = 0 ; i < arr1.length ; i++)
    {
        arr1[i] = psum[arr1[i]] ; 
    }
    return arr1 ;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int[]a = new int[n1];

    for (int i = 0; i < n1; i++) {
      a[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int[]b = new int[n2];

    for (int i = 0; i < n2; i++) {
      b[i] = scn.nextInt();
    }

    int[]ans = find(a, b);

    for (int val : ans) {
      System.out.print(val + " ");
    }
  }
}
