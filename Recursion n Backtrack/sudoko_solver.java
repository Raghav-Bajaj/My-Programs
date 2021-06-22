// import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[][] board){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void solveSudoku(int[][] board, int i, int j) {
if(i == board.length )
{
    display(board);
    return ;
}
int ni = 0  ;
int nj = 0;
    if(j == board[0].length -1 )
    {
        nj = 0 ;
        ni = i + 1 ;
    }else{
        nj = j+1 ;
        ni = i ;
    }
    
      if(board[i][j] != 0)
      {
          solveSudoku(board,ni,nj);
      }else{
           for(int p = 1 ; p < 10 ; p++)
    {
      if(validPut(board,p,i,j) == true)
      {
          board[i][j] = p ;
          solveSudoku(board,ni,nj);
          board[i][j] = 0 ;
      }
    }
      }
   
  }
    public static boolean validPut(int[][] board,int p,int row, int col)
    {
        for(int i = 0 ; i < board.length ; i++)
        {
            if(board[row][i] == p)
                return false ;
        }
         for(int i = 0 ; i < board[0].length ; i++)
        {
            if(board[i][col] == p)
                return false ;
        }
        int mat_r = 3*(row/3);
        int mat_c = 3*(col/3);
        for(int i = mat_r ; i < mat_r+3 ; i++)
        {
            for(int j = mat_c ; j < mat_c + 3 ; j++)
            {
                if(board[i][j] == p)
                    return false ;
            }
        }
        return true ;
    }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int[][] arr = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    solveSudoku(arr, 0, 0);
  }
}
