import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
   boolean[] cols = new boolean[n];
   boolean[] ndig = new boolean[2*n-1];
   boolean[] rdig = new boolean[2*n-1];
   Solve(board,0, cols,ndig , rdig , "");
    
  }
public static void Solve( boolean[][] board, int row ,  boolean[] cols , boolean[] ndig, boolean[] rdig,String asf )
{
    
    if(row == board.length)
    {
        System.out.println(asf+".");
        return ;
    }
    for(int col = 0 ; col < cols.length ; col++)
    {
        if(cols[col] == false && ndig[row+col] == false && rdig[row-col + board.length-1] == false){
            board[row][col] = true ;
            cols[col] = true ;
            ndig[row+col] = true ;
            rdig[row-col + board.length-1] = true ;
            Solve(board,row + 1, cols,ndig , rdig,asf+row + "-" + col+", " );
            board[row][col] = false ;
            cols[col] = false ;
            ndig[row+col] = false;
            rdig[row-col + board.length-1] = false ;
        }
    }
}
}
