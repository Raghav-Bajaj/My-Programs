import java.util.*;
import java.io.*;

public class Main {

    //return an array of size two, which contains first and last index of target.
    public static int[] find(int[]arr,int target) {
       int i = 0 , j = arr.length -1 ;
       int left = -1 ;
       int right = -1 ; 
       while(i < j)
       {
           int mid = (i+j)/2 ;
           if(arr[mid] == target)
           {
               if(mid > 0 && arr[mid -1] == arr[mid])
               {
                   j = mid  ;
               }else{
                   left = mid ;
                   break ;
               }
           }else if(target > mid)
           {
               i = mid+1;
           }else{
               j = mid-1 ;
           }
       }
         i = 0 ;
         j = arr.length -1 ;
       while(i < j)
       {
           int mid = (i+j)/2 ;
           if(arr[mid] == target)
           {
               if(mid < arr.length && arr[mid] == arr[mid+1])
               {
                   i = mid ;
               }else{
                   right = mid ;
                   break ;
               }
           }else if(target > mid)
           {
               i = mid+1 ;
           }else{
               j = mid-1 ;
           }
       }
        return new int[]{left,right} ;
    }
    

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[]arr = new int[n];

        for(int i=0;i < n;i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        int[]ans = find(arr,target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
