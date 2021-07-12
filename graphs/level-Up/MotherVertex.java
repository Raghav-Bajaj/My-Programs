import java.io.*;
import java.util.*;


public class Main{
    	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split(" ");
		int n = Integer.parseInt(st[0]);
		int m = Integer.parseInt(st[1]);

		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			st = br.readLine().split(" ");
			int u = Integer.parseInt(st[0]) - 1;
			int v = Integer.parseInt(st[1]) - 1;
			graph.get(u).add(v);
		}

		System.out.println(findMotherVertex(n, graph));
	}
    public static int findMotherVertex(int N, ArrayList<ArrayList<Integer>>adj){
			Stack<Integer> st = new Stack<>();
			boolean[] visited = new boolean[N];
			    for(int i = 0 ; i < N ; i++)
			    {
			        if(visited[i] == false)
			        {
			            dfs(adj , st , i , visited);
			        }
			    }
			   int ans = st.pop() ; 
			visited = new boolean[N];
			visited[ans] = true ;
			 for(int e : adj.get(ans))
			    {
			        if(visited[e] == false)
			        {
			            dfs(adj  , e , visited);
			        }
			    }
			    for(int i = 0 ; i < N ; i++)
			    {
			     //   System.out.println()
			        if(visited[i] == false)
			        {
			            return -1 ;
			        }
			    }
			return ans + 1;
       	}
       	public static void dfs(ArrayList<ArrayList<Integer>> graph ,Stack<Integer> st  , int cur , boolean[] visited )
       	{
       	    visited[cur] = true ;
       	    for(int e : graph.get(cur))
       	    {
       	        if(visited[e] == false)
       	        {
       	             dfs(graph , st , e , visited);
       	        }
       	    }
       	    st.push(cur);
       	}
       	 	public static void dfs(ArrayList<ArrayList<Integer>> graph , int cur , boolean[] visited )
       	{
       	    visited[cur] = true ;
       	    for(int e : graph.get(cur))
       	    {
       	        if(visited[e] == false)
       	        {
       	             dfs(graph  , e , visited);
       	        }
       	    }
       	
       	}
}
