import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      String[] st = br.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(st[j]);
      }
    }

    System.out.println(maxDistance(arr));

  }
      public static class Pair {
    int row;
    int col;

    Pair(int row, int col) {
      this.row = row;
      this.col = col;
    }
  }
  public static int maxDistance(int[][] grid) {
 int fresh  = 0 , level = -1 ;
    LinkedList<Pair> q = new LinkedList<>();
    for(int i = 0 ; i < grid.length ; i++)
    {
        for(int j = 0 ; j  < grid[0].length ; j++)
        {
            if(grid[i][j] == 0)
            {
                fresh++;
            }else if(grid[i][j] == 1)
            {
                q.addLast(new Pair(i,j));
            }
        }
    }
    if(fresh == 0 || fresh == grid.length*grid[0].length)
    {
        return -1 ;
    }
     int[][] dir = {{1,0} ,{0,1},{-1,0},{0,-1}};
    while(q.size() > 0 )
    {
        level++;
        int size = q.size();
        while(size-- > 0)
        {
            Pair p = q.removeFirst();
            for(int i  = 0 ; i < dir.length ; i++)
            {
                int x = p.row + dir[i][0] ;
                int y = p.col + dir[i][1] ; 
                if(x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == 0)
                {
                    grid[x][y] = 1 ;
                    fresh-- ;
                    q.addLast(new Pair(x,y));
                    
                }
            }
        }
        
    }
    if(fresh == 0)
    {
        return level ;
    }
    return -1 ;
    }
  
}
