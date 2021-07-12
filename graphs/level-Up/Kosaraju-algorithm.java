import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
	    Scanner sc = new Scanner(System.in);
        int v =  sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i < v ; i++)
        {
            graph.add(new ArrayList<Integer>()) ;
        }
        
        for(int i = 0 ; i < e ; i++)
        {
            int u = sc.nextInt() -1;
            int d = sc.nextInt() -1;
            graph.get(u).add(d);
        }
          System.out.println(Kosaraju(graph,v));
		}
		public static int Kosaraju(ArrayList<ArrayList<Integer>> graph , int n)
		{
		    Stack<Integer> st = new Stack<>();
		    boolean[] visited = new boolean[n];
		    for(int i = 0 ; i < n ; i++)
		    {
		        if(visited[i] == false)
		        {
		            dfs(graph , visited , st , i);
		        }
		    }
		  ArrayList<ArrayList<Integer>> rev = Transpose(graph , n);
		  visited = new boolean[n];
		  int count = 0 ;
		  while(st.size()>0)
		  {
		      int item = st.pop();
		      if(visited[item] == false)
		      {
		          dfs(rev , visited , item);
		          count++;
		      }
		  }
		  return count ;
		}
		public static void dfs(ArrayList<ArrayList<Integer>> graph , boolean[] visited , Stack<Integer> st  , int cur )
		{
		    visited[cur] = true ;
		    for(int e : graph.get(cur))
		    {
		        if(visited[e] == false)
		        {
		               dfs(graph , visited , st , e);
		        }
		    }
		    st.add(cur);
		}
      		public static void dfs(ArrayList<ArrayList<Integer>> graph , boolean[] visited , int cur )
		{
		    visited[cur] = true ;
		    for(int e : graph.get(cur))
		    {
		        if(visited[e] == false)
		        {
		               dfs(graph , visited  , e);
		        }
		    }
		}
		public static ArrayList<ArrayList<Integer>> Transpose(ArrayList<ArrayList<Integer>> graph  , int n)
		{
		    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		     for(int i = 0 ; i < n ; i++)
        {
            res.add(new ArrayList<Integer>()) ;
        }
		    for(int i = 0 ; i < n ; i++)
		    {
		        for(int e : graph.get(i))
		        {
		            res.get(e).add(i);
		        }
		    }
		    return res ;
		}
}
