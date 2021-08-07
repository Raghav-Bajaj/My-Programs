import java.util.*;

public class Main {

    public static int findMaxSteps(int[]arr) {
     int max = 0 ;
     int count = 0 ;
     for(int i = 1 ; i < arr.length ; i++)
     {
         if(arr[i] > arr[i-1])
         {
             count++ ;
             max = Math.max(count , max);
         }else{
             count = 0 ;
         }
     }
        return max;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = findMaxSteps(arr);
        System.out.println(ans);
    }
}
