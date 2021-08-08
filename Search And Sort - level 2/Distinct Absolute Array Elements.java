import java.util.*;
import java.io.*;

public class Main {

  public static int count(int[]arr) {
    int pre = Integer.MIN_VALUE ;
    int next = Integer.MAX_VALUE ;
    int i = 0 ;
    int j = arr.length -1 ;
    int count = 0 ;
    while(i <= j)
    {
        if(Math.abs(arr[i]) == Math.abs(arr[j]))
        {
            if(pre != Math.abs(arr[i]) && next != Math.abs(arr[j]))
            {
               count++ ;
                
            }
                pre =  Math.abs(arr[i]) ;
                next = Math.abs(arr[j]) ;
            
            i++;
            j--;
        }else if(Math.abs(arr[i]) > Math.abs(arr[j]))
            {
                if(pre != Math.abs(arr[i]))
                {
                    count++ ;
                
                }
                    pre = Math.abs(arr[i]);
                    i++;
            }else
            {
                 if(next != Math.abs(arr[j]))
                {
                        count++;
                }
               next = Math.abs(arr[j]);
                    j--;
            }
            
        }
    
    return count;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println(count(arr));
  }
}
