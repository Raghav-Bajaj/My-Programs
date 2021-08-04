import java.util.*;

public class Main {

  // ~~~~~~~~~~~~~User Section~~~~~~~~~~~~~
  public static void rotate(int[][] matrix) {
      int n = matrix.length ;
   for(int i = 0 ; i < n ; i ++)
   {
       for(int j = 0 ; j < i ; j++)
       {
           int temp = matrix[i][j] ;
           matrix[i][j] = matrix[j][i] ;
           matrix[j][i] = temp ;
       }
   }
     for(int i = 0 ; i < n ; i ++)
   {
       for(int j = 0 ; j < n/2 ; j++)
       {
           int temp = matrix[i][j] ;
           matrix[i][j] = matrix[i][n-1-j];
           matrix[i][n-1-j] = temp ;
           
  }
   }
  }

  // ~~~~~~~~~~~Input Management~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = scn.nextInt();
      }
    }
    rotate(matrix);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
