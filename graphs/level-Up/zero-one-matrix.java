import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
  private static class Pair {
    int x;
    int y;

    Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  private static int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
  public static int[][] updateMatrix(int[][] mat) {
    LinkedList<Pair> pq = new LinkedList<>();
    for(int i = 0 ; i <  mat.length ; i++)
    {
        for(int j = 0 ; j  < mat[0].length ; j++)
        {
            if(mat[i][j] == 1)
            {
                mat[i][j] = -1 ;
            }else{
                pq.addLast(new Pair(i,j));
            }
        }
    }
    while(pq.size() > 0 )
    {
       Pair p = pq.removeFirst();
       for(int i = 0 ; i < dirs.length ; i++)
       {
           int x = p.x + dirs[i][0];
           int y = p.y + dirs[i][1];
           if(x >= 0 && y >= 0 && x < mat.length && y < mat[0].length)
           {
               if(mat[x][y] < 0)
               {
                   pq.addLast(new Pair(x,y));
                   mat[x][y] = mat[p.x][p.y] + 1 ;
               }
           }
       }
    }
        return mat ;
  }
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] st = br.readLine().split(" ");
    int n = Integer.parseInt(st[0]);
    int m = Integer.parseInt(st[1]);

    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      st = br.readLine().split(" ");
      for (int j = 0; j < m; j++) {
        arr[i][j] = Integer.parseInt(st[j]);
      }
    }

    int[][] ans = updateMatrix(arr);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(ans[i][j] + " ");
      }
      System.out.println();
    }

  }


}
