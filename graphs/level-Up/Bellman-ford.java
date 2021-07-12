import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] graph = new int[e][3];
        for(int i = 0 ; i < e ; i++)
        {
            graph[i][0] = sc.nextInt() -1;
             graph[i][1] = sc.nextInt() -1;
              graph[i][2] = sc.nextInt();
            
        }
        int[] arr = new int[v];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[0] = 0 ;
        for(int i = 0 ; i < v-1 ; i++)
        {
            for(int j = 0 ; j < e ; j++)
            {
                int u = graph[j][0];
                int d = graph[j][1];
                int w = graph[j][2];
                if(arr[u] != Integer.MAX_VALUE)
                {
                    if(arr[u] + w < arr[d])
                    {
                        arr[d] = arr[u] + w ;
                    }
                }
                
            }
        }
        for(int i = 1 ; i < v ; i++ )
        {
            if(arr[i] != Integer.MAX_VALUE)
            {
                System.out.print(arr[i] + " ");
            }else{
                 System.out.print("1000000000 ");
            }
        }
         System.out.println();
			}
}
