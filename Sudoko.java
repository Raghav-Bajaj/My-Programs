/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static boolean issafetoput(int[][] sudoko , int i , int j , int number){
        for(int k = 0 ; k < 9 ; k++){
            if(sudoko[i][k] == number || sudoko[k][j] == number ){
                return false ;
            }
        }
        int starti = (i/3)*3;
        int startj = (j/3)*3;
        for(int k = starti ; k < 3+starti ; k++){
            for(int l = startj ; l < 3+startj ; l++){
                if(sudoko[k][l] == number){
                    return false ;
                }
            }
        }
        return true ;
    }
    public static boolean sudokoSolver(int[][] sudoko ,int i , int j){
        int n = 9;
        if(i == n ){
            for(int l = 0 ; l < n ; l++){
                for(int k = 0 ; k < n ; k++){
                    System.out.print(sudoko[l][k]+" ");
                }
                System.out.print("\n");
            }
                System.out.print("\n");

                        return true;
        }
        if(j==n){
            return sudokoSolver(sudoko , i+1 , 0);
        }
        if(sudoko[i][j] != 0 ){
            return sudokoSolver(sudoko , i , j+1) ;
        }
        for(int num = 1 ; num<10;num++){
            if(issafetoput(sudoko , i , j , num) == true){
                sudoko[i][j] = num;
                boolean checker = sudokoSolver(sudoko , i , j+1);
                if(checker == true){
                    return true ;
                }
                sudoko[i][j] = 0 ;
            }
        }
        return false ;
    }
	public static void main (String[] args) {
       
             int sudoko[][] = {
            {
                0,0,5,0,0,9,0,0,0
            },
            {
                6,1,0,0,3,8,9,0,0
            },
            {
                8,0,0,2,1,0,0,5,0
            },{
               0,0,6,0,0,0,0,0,9
            },
            {
                0,0,3,0,0,0,1,0,0
            },
            {
                5,0,0,0,0,0,7,0,0
            },
            {
                0,7,0,0,4,5,0,0,1
            },
            {
                0,0,1,8,7,0,0,9,2
            },
            {
                0,0,0,6,0,0,4,0,0
            }
        };
        sudokoSolver(sudoko  , 0 , 0);
        
            //         for(int l = 0 ; l < 9 ; l++){
            //     for(int k = 0 ; k < 9 ; k++){
            //         System.out.print(sudoko[l][k]+" ");
            //     }
            //     System.out.print("\n");
            // }
            //     System.out.print("\n");
     
      
  
	}
}
