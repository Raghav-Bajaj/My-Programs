import java.util.*;
import java.io.*;

public class Main {

    /*your task is to complete this function which returns true if target exists in the matrix
    else return false*/
    public static boolean search(int[][]matrix,int target) {
        int i = 0 ;
        int j = matrix[0].length -1;
        
        while(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] == target)
            {
                return true ;
            }else if(matrix[i][j] > target)
            {
                j--;
            }else{
                i++ ;
            }
            
        }
        return false;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][]matrix = new int[m][n];

        for(int i=0; i < m;i++) {
            for(int j=0; j < n;j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        int target = scn.nextInt();

        boolean isFound = search(matrix,target);
        System.out.println(isFound);

    }
}
