import java.io.*;
import java.util.*;

public class Main {
   
    public static class Edge{
        int v ;
        int n ;
        Edge(int v , int n)
        {
            this.v = v ;
            this.n = n ;
        }
    }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      ArrayList<Edge>[] graph = new ArrayList[n];
      for(int i = 0 ; i < n ; i++)
      {
          graph[i] = new ArrayList<>();
      }
      for(int i = 0 ; i < k ; i++)
      {
          String val = br.readLine();
          String[] st = val.split(" ");
          int a = Integer.parseInt(st[0]);
          int b = Integer.parseInt(st[1]);
          graph[a].add(new Edge(a,b));
          graph[b].add(new Edge(b,a));
      }
      
      boolean[] visited = new boolean[n];
      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      for(int i = 0 ; i < n ; i++)
      {
          if(visited[i] == false)
          {
              ArrayList<Integer> arr = new ArrayList<>();
              drawTree(graph ,i, arr , visited);
              comps.add(arr);
          }
      }
      int res = 0 ;
      for(int i = 0 ; i < comps.size() -1 ; i++)
      {
          for(int j = i+1 ; j < comps.size() ; j++ )
          {
              res += comps.get(i).size()*comps.get(j).size();
          }
      }
      System.out.println(res);
   }
   public static void drawTree(ArrayList<Edge>[] graph , int src , ArrayList<Integer> arr , boolean[] visited)
   {
       visited[src] = true ;
       arr.add(src);
       for(Edge e : graph[src])
       {
           if(visited[e.n] == false)
           {
                drawTree(graph ,e.n, arr , visited);
           }
       }
   }

}
