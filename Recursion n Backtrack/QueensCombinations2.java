import java.io.*;
import java.util.*;

public class Main {

    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int i, int j){
        if(qpsf == tq)
        {
            for(int row = 0 ; row < tq ; row++)
        {
           for(int col = 0 ; col < tq ; col++)
        {   
            if(chess[row][col] == true)
            {
                System.out.print("q\t");
            }else{
                System.out.print("-\t");
            }
        }
        System.out.println();
        }
             System.out.println();
        return ;
        }
        for(int col = j+1 ; col < tq ; col++)
        {
           
                chess[i][col] = true ;
                queensCombinations(qpsf+1 , tq , chess , i , col);
                chess[i][col] = false ;
        }
         for(int row = i+1 ; row < tq ; row++)
        {
           for(int col = 0 ; col < tq ; col++)
        {  
            
                chess[row][col] = true ;
                queensCombinations(qpsf+1 , tq , chess , row , col);
                chess[col][col] = false ;
            
        }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];
        
        queensCombinations(0, n, chess, 0, -1);
    }
}
