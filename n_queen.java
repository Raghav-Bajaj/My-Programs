/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static boolean isSafeToPut(int p , int[][] sol , int q , int n){
    int i = p , j = q ;
    for (int k = 0 ;k < n ; k++ ){
        if(sol[i][k] == 1 || sol[k][j] == 1){
            return false ;
        }
    } 
  while(i >= 0 && j >= 0){
      if(sol[i][j] == 1){
          return false ;
      }
      i--;
      j--;
  }
  i = p ; 
  j = q ;
  while(i>=0 && j < n){
      if(sol[i][j] == 1){
          return false;
      }
      i--;
      j++;
  }
  return true ;
}
public static boolean nqueen(int n , int[][] sol , int i)
{
    if(i == n){
        for(int l = 0 ; l< n ; l++){
            for(int k = 0 ; k < n ; k++){
                System.out.print(sol[l][k]+ " ");
            }
            System.out.print("\n");
        }
                    System.out.print("\n");

        return false ;
    }
    for(int j = 0 ; j < n ; j++){

    if( isSafeToPut( i , sol , j , n) == true){
            sol[i][j] = 1 ;
    boolean kyasabsahi = nqueen(n , sol , i+1);
        if(kyasabsahi == true){
                    
                return true ;
        }
        sol[i][j] = 0 ;
        
    }
    
}
return false ;
}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sol[][] = new int[n][n];
	nqueen( n , sol , 0 );

	}
}
