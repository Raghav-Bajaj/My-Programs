import java.util.*;
import java.io.*;

public class Main {

  public static ArrayList<Integer>  solve(int[]arr) {
      Arrays.sort(arr);
    HashMap<Integer , Integer > map = new HashMap<>();
    for(int val : arr)
    {
        map.put(val , map.getOrDefault(val,0)+1);
    }
    int ans = 0 ;
    int res = 0 ;
    for(int val : map.keySet())
    {
        if(map.get(val) >= 4)
        {
            int count = map.get(val)/4 ;
            int temp = val*val ;
            if(temp > ans)
            {
                ans = temp ;
                res = count ;
            }
        }
    }
    ArrayList<Integer> solution  =  new ArrayList<Integer>();
    solution.add(ans);
    solution.add(res);
  
      return solution ;
  }
  

  public static void main(String[]args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    ArrayList<Integer>ans = solve(arr);

    for (int val : ans) {
      System.out.print(val + " ");
    }
  }
}
