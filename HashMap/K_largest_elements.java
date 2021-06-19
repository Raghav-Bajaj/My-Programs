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
      for(int val : arr)
      {
          q.add(val);
      }
      int j = q.size();
      for(int i = 0 ; i < j ; i++ )
      {
          if(i+k < j)
          {
              q.remove();
          }else{
              int s = q.peek();
              q.remove();
              System.out.println(s);
          }
      }
    }

}
