import java.io.*;
import java.util.*;

public class Main {

    public static boolean IsQueenSafe(int[][] chess, int row, int col) {
    for(int  i = chess.length-1  , j = col ; i >= 0 ; i--)
    {
        if(chess[i][j] >  0){
             return false ;
        }
           
    }
    for(int i = row , j =chess.length-1 ; j >=0 ; j--)
    {
        if(chess[i][j] > 0)
        {
           return false ; 
        }
            
    }
    for(int  i =  chess.length-1 , j = chess.length-1 ; i >=0  && j >= 0 ; i-- , j--)
    {
        if(chess[i][j] > 0){
             return false ;
        }
           
    }
        for(int i = chess.length-1 , j = 0 ; i >=0  && j < chess[0].length ; i-- , j++)
    {
        if(chess[i][j] > 0){
             return false ;
        }
    }
    return true ;
    }

    public static void nqueens(int qpsf, int tq, int[][] chess) {
if(qpsf == tq)
{
    for(int  i = 0 ; i < tq ; i++)
    {
        for(int j = 0 ; j < tq ; j++)
        {
            if(chess[i][j] != 0)
            {
                System.out.print("q" + chess[i][j] +"\t");
            
            }else{
                System.out.print("-\t");
            }
        }
        System.out.println();
    }
            System.out.println();
    return ;
}

    for(int j = 0 ; j < chess.length*chess.length ; j++)
    {   int row = j /chess.length ;
        int col = j % chess.length ;
        if(IsQueenSafe(chess , row , col))
        {
            chess[row][col] = qpsf+1 ;
            nqueens(qpsf+1 , tq , chess);
            chess[row][col] = 0 ;
        }
}
//  nqueens(qpsf , tq , chess);
// if(j == tq)
// {
//     return ;
// }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];

        nqueens(0, n, chess);
    }
}
