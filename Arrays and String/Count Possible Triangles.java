import java.util.*;
import java.io.*;

public class Main {

  public static int countTriangles(int[]arr) {
    int count = 0 ;
    Arrays.sort(arr);
    for(int i = arr.length -1 ; i >= 2 ; i--)
    {
        int j = i-1 ;
        int k = 0 ;
        while(k < j)
        {
            if(arr[j] + arr[k] > arr[i])
                {
                    
                    count += j - k;
                    j--;
                }else{
                    k++ ;
                }
                    
                
        }
    }
    return count ;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println(countTriangles(arr));
  }
}
