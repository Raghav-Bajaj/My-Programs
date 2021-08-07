import java.util.*;

public class Main {

    public static int maximise(int[]arr) {
        int n = arr.length ;
        int count = 0 ;
        int max = 0 ;
        while(count < n)
        {
            int sum = 0 ;
            for(int i = 0 ; i < n; i++)
            {
                sum += arr[i] *((i+count)%n) ;
            }
            max = Math.max(sum,max);
            count++ ;
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
