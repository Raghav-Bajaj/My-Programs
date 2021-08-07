import java.util.*;

public class Main {

    public static int maximise(int[]arr) {
       Arrays.sort(arr);
       int max =0 ;
       for(int i = 0 ; i < arr.length ; i++)
       {
           max += arr[i]*i ; 
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

        int ans = maximise(arr);
        System.out.println(ans);
    }
}
