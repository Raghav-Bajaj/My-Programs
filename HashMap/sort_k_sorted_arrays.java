import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      PriorityQueue<Integer> q = new PriorityQueue<>();
      int i = 0 ;
      while(i < k+1)
      {
          q.add(arr[i]);
          i++;
      }
        for( i = k +1 ; i < n ; i++)
        {
            int val = q.peek();
            q.remove();
            System.out.println(val);
            q.add(arr[i]);
        }
        while(q.size()>0)
        {
           int val = q.peek();
            q.remove();
            System.out.println(val); 
        }
   }

}
