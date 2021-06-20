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

     boolean[] visit = new boolean[vtces];
           ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
     for(int v = 0 ; v < vtces ; v++)
     {
         if(visit[v] == false)
         {
             ArrayList<Integer> arr = new ArrayList<>();
             drawG(graph , v , arr , visit);
             comps.add(arr);
         }
     }
     
      System.out.println(comps.size() == 1 ) ;
   }
   
   
   public static void drawG( ArrayList<Edge>[] graph , int src , ArrayList<Integer> arr , boolean[] visit)
   {
       visit[src] = true ;
       arr.add(src);
       for(Edge e : graph[src])
       {
           if(visit[e.nbr] == false)
           {
               drawG(graph , e.nbr,arr,visit);
           }
           
       }
   }
}
