import java.io.*;
import java.util.*;

public class Main {
    public static class Pair implements Comparable<Pair>{
        int val ;
        int index ;
        int list ;
        Pair(int val , int index , int list)
        {
            this.val = val ;
            this.index = index ;
            this.list = list ;
        }
        public int compareTo(Pair ot)
        {
            return this.val - ot.val ;
        }
    }
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();
      PriorityQueue<Pair> pq = new PriorityQueue<>();
      for(int i = 0 ; i < lists.size() ; i++)
      {
          int val = lists.get(i).get(0);
          Pair pr = new Pair(val , 0 , i);
          pq.add(pr);
      }
      while(pq.size() > 0 )
      {
          Pair pair = pq.remove();
          rv.add(pair.val);
          pair.index++ ;
          if(pair.index  < lists.get(pair.list).size())
          {
              pair.val = lists.get(pair.list).get(pair.index);
              pq.add(pair);
          }
      }

      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}
