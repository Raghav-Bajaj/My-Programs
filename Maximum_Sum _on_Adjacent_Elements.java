import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int  i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int include = arr[0] ;
        int exclude = 0 ;
        for(int i = 1 ; i < n ; i++)
        {
         int temp = Math.max(include,exclude) ;
         include = arr[i] + exclude ;
         exclude = temp ;
        }
        int res = Math.max(include , exclude);
        System.out.println(res);
    }
}
