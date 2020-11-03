/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static boolean ratinmaze(int[][] sol , int[][] maze , int n , int m , int i , int j){
        if(i == n-1 && j == m-1){
            sol[i][j] = 1 ;
             for ( int s = 0 ; s < 4 ; s ++){
            for( int r = 0 ; r <  4 ;r++){
                System.out.print(sol[s][r]);
            }
            System.out.print("\n");
      }
                  System.out.print("\n");

          return false;
        }
        sol[i][j] = 1 ;
        if(j+1 < n && maze[i][j+1]!=9){
            boolean kyarightsafehai = ratinmaze(sol,maze,n,m,i,j+1);
            if(kyarightsafehai == true){
                return true;
            }
        }
        if(i+1<n && maze[i+1][j]!=9){
            boolean kyanichesafehai =ratinmaze(sol,maze,n,m,i+1,j);
                if(kyanichesafehai == true)
                {
                    return true ;
            }
        
        }
        sol[i][j] = 0 ;
        return false ;
    }
	public static void main (String[] args) {
        int maze[][] = new int[4][4];
        
        for (int i = 0 ; i < 4 ; i ++){
            for(int j = 0 ; j <  4 ;j++){
                maze[i][j] = 0 ;
                if(i >= 2 && j==2 )
                maze[i][j] = 9 ;
                // System.out.print(maze[i][j]);
            }
        }
        int sol[][] = new int[4][4];
     
        ratinmaze(sol,maze , 4 , 4 ,0,0);
     
      
  
	}
}
