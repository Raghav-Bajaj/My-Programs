
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static class Pair{
        int a ;
        int b ;
        Pair(int a , int b)
        {
            this.a = a ;
            this.b = b ;
        }
    }
    public static int[][] mergeIntervals(int Int[][]){
       Arrays.sort(Int , (a,b)->Integer.compare(a[0],b[0]));
      ArrayList<int[]> arr = new ArrayList<>();
      for(int[] inter : Int)
      {
          if(arr.size() == 0)
          {
              arr.add(inter);
          }else{
              int[] pre = arr.get(arr.size()-1);
              if(inter[0] < pre[1])
              {
                 pre[1] = Math.max(pre[1] , inter[1]);

              }else{
                  arr.add(inter);
              }
            
          }
      }
      int[][] res = new int[arr.size()][2];
     for(int i = 0 ; i < arr.size() ; i++)
     {
        int[] aj = arr.get(i);
        res[i][0] = aj[0];
        res[i][1] = aj[1];
     }
     return res ;
    
       
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        // Input Format
        int n = scn.nextInt();
        int input[][] = new int[n][2];

        for(int i = 0 ; i <  n ; i++){
            int sp = scn.nextInt();
            int ep = scn.nextInt();

            input[i][0] = sp;
            input[i][1] = ep;
        }

        // Output Format
        int [][]output = mergeIntervals(input);

        System.out.print("[");
        for(int arr[] : output){
            System.out.print(Arrays.toString(arr));
        }
        System.out.println("]");
    }
}
