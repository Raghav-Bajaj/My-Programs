import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static boolean meetingRooms(int Int[][]){
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
                return false ;

              }else{
                  arr.add(inter);
              }
            
          }
      }return true ;
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
        boolean res = meetingRooms(input);
        System.out.println(res);
    }
}
