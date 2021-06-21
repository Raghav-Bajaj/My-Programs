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

     
     boolean[] visited = new boolean[vtces];
    for(int  i = 0 ; i < vtces ; i++)
    {
        if(visited[i] == false)
        {
            PrintMst(graph , i , visited);
        }
    }
   }
   public static void  PrintMst(ArrayList<Edge>[] graph ,int src , boolean[] visited)
   {
     PriorityQueue<Pair> q = new PriorityQueue<>();
     q.add(new Pair(0 ,-1 , 0));
     while(q.size() > 0)
     {
         Pair p = q.remove();
         if(visited[p.v] == false)
         {
             visited[p.v] = true ;
               if(p.r!=-1)
         {
          System.out.println("[" + p.v +"-"+p.r+"@"+p.wt +"]");   
         }
         for(Edge e : graph[p.v])
         {
             if(visited[e.nbr]==false)
             {
                 q.add(new Pair(e.nbr,p.v , e.wt));
             }
         }
         }
       
     }
   }
    public static class Pair implements Comparable<Pair>{
        int v ;
        int r ;
        int wt ;
        Pair(int v, int r , int wt)
        {
            this.v = v ;
            this.r = r ;
            this.wt = wt;
        }
        public int compareTo(Pair ot)
        {
            return this.wt - ot.wt ;
        }
    }
}
