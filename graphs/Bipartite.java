import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   public static class Pair{
       int v ;
       int l ;
       Pair(int v , int l)
       {
           this.v = v ;
           this.l = l ;
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
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int[] visited = new int[vtces];
      Arrays.fill(visited,-1);
      for(int i = 0 ; i < vtces ; i++)
      {
          if(visited[i] == -1)
          {
             boolean check = Bipartite(graph , i , visited);
             if(check == false)
             {
                 System.out.println(false);
                 return ;
             }
          }
      }
       System.out.println(true);
   }
   public static boolean Bipartite( ArrayList<Edge>[] graph  , int src , int[] visited)
   {
       ArrayDeque<Pair> q = new ArrayDeque<>();
       q.add(new Pair(src , 0));
       while(q.size() > 0)
       {
           Pair p = q.removeFirst();
           if(visited[p.v] != -1)
           {
               if(visited[p.v] !=  p.l)
               {
                   return false ;
               }
               
           }else{
               visited[p.v] = p.l ;
               for(Edge e : graph[src])
               {
                  if(visited[e.nbr] == -1)
                  {
                      q.add(new Pair(e.nbr , p.l +1));
                  }
               }
           }
       }
      return true ;
   }
}
