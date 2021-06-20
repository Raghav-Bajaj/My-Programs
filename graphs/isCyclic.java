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
        String psf ;
        Pair(int v , String psf)
        {
            this.v = v ;
            this.psf = psf ;
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
     
        for(int i = 0 ; i < vtces ; i++)
        {
            if(visited[i] == false){
            boolean mark = isCyclic(graph , i , visited);
            if(mark)
            {
                System.out.println(true);
                return ;
            }
            }
          
        }

          System.out.println(false);
   }
   public static boolean isCyclic(ArrayList<Edge>[] graph ,int src , boolean[] visited)
   {
      ArrayDeque<Pair> queue = new ArrayDeque();
        queue.add(new Pair(src , src + ""));
             while(queue.size() >  0 )
      {
        Pair pr = queue.removeFirst();
        if(visited[pr.v] == true)
        {
            return true ;
        }
        visited[pr.v] = true ;
        for(Edge e : graph[pr.v])
        {
            if(visited[e.nbr] == false)
            {
                queue.add(new Pair(e.nbr , pr.psf + e.nbr));
            }
        }
      
      }
        return false ;
   }
}
