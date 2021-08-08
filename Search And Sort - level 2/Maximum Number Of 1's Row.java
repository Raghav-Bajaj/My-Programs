import java.util.*;
import java.io.*;

public class Main {

  public static int findRow(int[][]mat) {
    int max = 0 ;
    int res = 0 ;
    for(int i = 0 ; i < mat.length ; i++)
    {
        int curr = BinarySearch(mat , i);
        if(curr > max)
        {
            max = curr ;
            res = i ;
        }
    }
    return res ;
  }

public static int BinarySearch(int[][] mat , int r)
{
    int l = 0 ;
    int n = mat[0].length ;
    int right = n-1 ;
    int ans  = 0 ;
    while(l <= right)
    {
        int mid = (l+right)/2 ;
        if(mat[r][mid] == 1)
        {
            ans = n-mid+1 ;
            right = mid -1 ;
         }else{
             l = mid+1 ;
         }
         
    }
    return ans ;
}
  public static void main(String[]args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

    int[][]mat = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        mat[i][j] = scn.nextInt();
      }
    }

    System.out.println(findRow(mat));
  }
}
