import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~
    public static int minTotalDistance(int[][] grid) {
       ArrayList<Integer> x = new ArrayList<>();
       for(int i = 0 ; i < grid.length ; i++)
       {
           for(int j = 0 ; j < grid[0].length ; j++)
           {
               if(grid[i][j] == 1)
               {
                   x.add(i);
               }
           }
       }
          ArrayList<Integer> y = new ArrayList<>();
       for(int i = 0 ; i < grid[0].length ; i++)
       {
           for(int j = 0 ; j < grid.length ; j++)
           {
               if(grid[j][i] == 1)
               {
                   y.add(i);
               }
           }
       }
       int res = 0 ;
       int x_mid = x.get(x.size()/2);
       for(int i = 0 ; i < x.size() ; i++)
       {
           res += Math.abs(x.get(i)-x_mid);
       }
        int y_mid = y.get(y.size()/2);
       for(int i = 0 ; i < y.size() ; i++)
       {
           res += Math.abs(y.get(i)-y_mid);
       }
       return res ;
    }

    // ~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();


        int[][] grid = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = scn.nextInt();
            }
        }

        int dist = minTotalDistance(grid);
        System.out.println(dist);
    }
}
