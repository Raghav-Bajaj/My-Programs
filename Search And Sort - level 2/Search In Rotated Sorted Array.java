import java.util.*;
import java.io.*;

public class Main {

    public static int find(int[]arr,int target) {
        int i = 0 , j = arr.length-1;
        while(i < j)
        {
            int mid = (i+j)/2 ;
            if(arr[mid] == target)
            {
                return mid ;
            }else if(arr[i] <= arr[mid])
            {
                  if(arr[i] <= target && target < arr[mid])
                {
                    j = mid -1 ;
                }else{
                    i = mid+1 ;
                }
            }else{
                if(arr[mid] < target && target < arr[j])
                {
                    i = mid + 1 ;
                }else{
                    j = mid-1 ;
                }
            }
          
        }
        return -1 ;
        
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];

        for(int i=0; i < n;i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        int ans = find(arr,target);
        System.out.println(ans);
    }
}
