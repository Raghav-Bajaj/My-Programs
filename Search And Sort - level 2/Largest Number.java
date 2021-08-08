import java.util.*;
import java.io.*;

public class Main {

  public static String largestNumber(int[]nums) {
    String[] str = new String[nums.length];
    for(int i = 0 ; i < nums.length ; i++)
    {
        str[i] = nums[i]+ "" ;
    }
    Arrays.sort(str , (a,b)->{
        long r = Long.parseLong(a + b) ;
        long g = Long.parseLong(b + a);
        if(r > g)
        {
            return 1 ;
        }else if(r  < g)
        {
            return -1 ;
        }else{
            return 0 ;
        }
    });
    StringBuilder ss = new StringBuilder("");
    for(int i =  nums.length -1 ; i >=0 ;i--)
        ss.append(str[i]);
    return ss.toString();
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = scn.nextInt();
    }

    System.out.println(largestNumber(nums));
  }
}
