import java.util.*;

public class Main {

    public static int findRotationCount(int[]arr) {
              int i = 0 ; 
       int j = arr.length -1 ;
       int n = arr.length ;
       if(arr[i] <= arr[j])
       {
           return 0 ;
       }
       while(i <= j)
       {
           int mid = (i+j)/2 ;
           if(arr[mid] > arr[mid+1])
           {
               int temp = n - (mid+1) ;
               return temp > n/2 ? n- temp : temp ;
           }
          else if( arr[mid] < arr[mid-1])
           {
              int temp = n - mid ;
               return temp > n/2 ? n- temp : temp ;
           }
           else if(arr[i] <= arr[mid])
               {
                   i = mid +1 ;
               }else{
                   j = mid -1 ;
               }
           
       }
        return 0;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = findRotationCount(arr);
        System.out.println(ans);
    }
}
