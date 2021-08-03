import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~
    public static int maxChunksToSorted2(int[] arr) {
        int max = arr[0] ;
        int n = arr.length ;
        int[] mins = new int[n+1];
        mins[n] = Integer.MAX_VALUE ;
        int count = 0 ;
        for(int i = n-1 ; i >=0 ; i--)
        {
            mins[i] = Math.min(mins[i+1] , arr[i]);
        }
        for(int i = 0 ; i < n  ; i++)
        {
            max = Math.max(arr[i] , max);
            if(max <= mins[i+1])
                count++;
          
        }
        return count ;
    }

    // ~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = maxChunksToSorted2(arr);
        System.out.println(res);
    }
}
