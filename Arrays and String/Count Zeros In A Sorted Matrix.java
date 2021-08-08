import java.util.*;
import java.io.*;

public class Main {

  public static int countZeros(int[][]mat) {
  int j = mat[0].length -1;
  int i = 0 ;
  int count = 0 ;
  while(i < mat.length && j >= 0)
  {
      if(mat[i][j] == 1)
      {
          j-- ;
      }else{
          i++;
          count += (j+1);
      }
  }
    return count ;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[][]mat = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = scn.nextInt();
      }
    }

    System.out.println(countZeros(mat));
  }
}
