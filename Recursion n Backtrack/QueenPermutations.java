import java.io.*;
import java.util.*;

public class Main {

    public static void queensPermutations(int qpsf, int tq, int[][] chess){
      if(qpsf == tq)
      {
         for(int i = 0 ; i < tq ; i++)
      {
          for(int j = 0 ; j < tq ; j++)
          {
             if(chess[i][j] != 0)
             {
                 System.out.print("q" + chess[i][j] + "\t");
             }else{
                  System.out.print("-\t");
             }
          }
           System.out.println();
      }
      System.out.println();
          return ;
      }
      for(int i = 0 ; i < tq ; i++)
      {
          for(int j = 0 ; j < tq ; j++)
          {
              if(chess[i][j] == 0)
              {
                  chess[i][j] = qpsf +1 ;
                  queensPermutations(qpsf+1 , tq , chess);
                  chess[i][j] = 0 ;
              }
          }
      }

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        
        queensPermutations(0, n, chess);
    }
}
