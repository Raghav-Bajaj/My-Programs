import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
      public static class Pair{
       int v ;
       int t ;
       Pair(int v , int t)
       {
           this.v = v ; this.t = t ;
       }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      int[] visited = new int[vtces];
      ArrayDeque<Pair> q = new ArrayDeque<>();
      q.add(new Pair(src ,1)) ;
      int count= 0 ;
      while(q.size() > 0)
      {
          Pair p = q.removeFirst();
          if(visited[p.v] > 0)
          {
             continue ;
          }
          visited[p.v] = p.t ;
          if(p.t > t)
          {
              break ;
          }
          count++ ;
          for(Edge e : graph[p.v])
          {
              if(visited[e.nbr] == 0)
              {
                  q.add(new Pair(e.nbr , p.t + 1));
              }
          
      }
      
   }  
    System.out.println(count);
       
   }

}
 
