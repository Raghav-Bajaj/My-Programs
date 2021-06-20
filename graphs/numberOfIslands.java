import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      boolean[][] visit = new boolean[n][m];
      int count = 0 ;
      for(int i = 0 ; i < n ; i++)
      {
          for(int j = 0 ; j < m ; j++)
          {
              if(arr[i][j] == 0 && visit[i][j] == false)
              {
                  markIsland(arr,i,j,visit,n,m);
                  count++;
              }
          }
      }
      System.out.println(count);
   }
   public static void markIsland(int[][] arr , int i , int j , boolean[][] visit,int n , int m)
   {
       if(i < 0 ||  j < 0 || i >= n || j >= m || visit[i][j] == true || arr[i][j] == 1)
            return ;
            
        visit[i][j] = true ;
       markIsland(arr,i-1,j,visit,n,m);
       markIsland(arr,i+1,j,visit,n,m);
       markIsland(arr,i,j-1,visit,n,m);
       markIsland(arr,i,j+1,visit,n,m);
   }

}
