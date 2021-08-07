import java.util.*;
import java.io.*;

public class Main {

    public static int pivot_index(int[]arr) {
        int n = arr.length ;
        int[] lsum = new int[n];
        lsum[0] = arr[0] ;
        for(int i = 1; i < n ; i++)
        {
            lsum[i] = arr[i] +  lsum[i-1];
        }
        int[] rsum = new int[n];
        rsum[n-1] = arr[n-1];
        for(int i = n-2 ; i >= 0 ; i--)
        {
            rsum[i] =arr[i] +  rsum[i+1];
        }
        for(int i = 1 ; i < n-1 ; i++)
        {
            // System.out.println(lsum[i-1] + " " +rsum[i+1]);
            if(lsum[i-1] == rsum[i+1])
                return i ;
        }
        
        return -1;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for(int i=0; i < arr.length;i++) {
            arr[i] = scn.nextInt();
        }

        int pi = pivot_index(arr);
        System.out.println(pi);
    }
}
