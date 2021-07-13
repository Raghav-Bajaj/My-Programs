
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

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

    System.out.println(orangesRotting(arr));

  }

  public static class Pair {
    int row;
    int col;

    Pair(int row, int col) {
      this.row = row;
      this.col = col;
    }
  }

  
  public static int orangesRotting(int[][] grid) {
    int fresh  = 0 , level = -1 ;
    LinkedList<Pair> q = new LinkedList<>();
    for(int i = 0 ; i < grid.length ; i++)
    {
        for(int j = 0 ; j  < grid[0].length ; j++)
        {
            if(grid[i][j] == 1)
            {
                fresh++;
            }else if(grid[i][j] == 2)
            {
                q.addLast(new Pair(i,j));
            }
        }
    }
    if(fresh == 0)
    {
        return 0 ;
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
                if(x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == 1)
                {
                    grid[x][y] = 0 ;
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
