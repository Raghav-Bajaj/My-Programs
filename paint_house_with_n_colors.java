import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[][] = new int[n][k];
         int dp[][] = new int[n][k];
        for(int i = 0 ;i < n ; i++)
        {
            for(int j = 0 ; j < k ; j++)
            {
                arr[i][j] = sc.nextInt();
                if(i == 0)
                {
                     dp[0][j] = arr[0][j];
                }
            }
           
        }
    for(int i = 1 ;i < n ; i++)
        {
            for(int j = 0 ; j < k ; j++)
            {
       
                dp[i][j] = arr[i][j] + minimum(dp,i-1,j) ;
            }
        }
        
        int ann =  Integer.MAX_VALUE ; 
           for(int i = 0 ; i < k ; i++)
        {
            
                if(ann > dp[n-1][i])
                {
                    ann = dp[n-1][i];
                }
            }
            
             System.out.println(ann);
        }
        
       

    public static  int minimum(int[][]dp , int row , int exclude)
    {
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < dp[row].length ; i++)
        {
            if(i!=exclude)
            {
                if(min > dp[row][i])
                {
                    min = dp[row][i];
                }
            }
        }
        return min ;
    }
}
