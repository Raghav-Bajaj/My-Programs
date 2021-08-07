import java.util.*;

public class Main {

    public static int findMinimum(int[]arr) {
       int i = 0 ; 
       int j = arr.length -1 ;
       if(arr[i] <= arr[j])
       {
           return arr[i] ;
       }
       while(i <= j)
       {
           int mid = (i+j)/2 ;
           if( arr[mid] < arr[mid-1])
           {
               return arr[mid];
           }else if(arr[mid] > arr[mid+1])
           {
               return arr[mid+1] ;
           }
           else if(arr[i] <= arr[mid])
               {
                   i = mid +1 ;
               }else{
                   j = mid -1 ;
               }
           
       }
        return -1;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = findMinimum(arr);
        System.out.println(ans);
    }
}
