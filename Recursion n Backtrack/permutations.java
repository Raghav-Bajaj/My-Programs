import java.io.*;
import java.util.*;

public class Main {

  public static void permutations(int[] boxes, int ci, int ti){
    // write your code here
    if(ci > ti)
    {
        for(int j = 0 ; j < boxes.length ; j++)
        {
            System.out.print(boxes[j]);
        }
        System.out.println();
        return ;
    }

        for(int j = 0 ; j < boxes.length ; j++)
        {
            if(boxes[j] == 0)
            {
                boxes[j] = ci ;
                permutations(boxes , ci+1 , ti);
                boxes[j] = 0 ;
            }
        }
    }
  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    permutations(new int[nboxes], 1, ritems);
  }

}
