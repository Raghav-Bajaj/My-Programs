import java.util.*;

public class Main {
    
    //~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length ;
         int[] left = new int[n];
         int[] right = new int[n]; 
         left[0] = arr[0] ;
         
         for(int i = 1 ; i < n ; i++ )
            left[i] = left[i-1] * arr[i] ;
        right[n-1] = arr[n-1];
        for(int i = n-2 ; i >= 0 ; i--)
            right[i] = right[i+1]*arr[i] ;
        int[] ans = new int[n];
        ans[0] = right[1];
        ans[n-1] = left[n-2];
        for(int i= 1 ; i < n-1 ; i++)
        {
            ans[i] = left[i-1] * right[i+1];
        }
        return ans ;
        
    }

    //~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] res = productExceptSelf(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
