import java.util.*;

public class Main {
  public static int[][] intersection(int i1[][], int i2[][]) {
    ArrayList<int[]> res = new ArrayList<>();
    int n1 = i1.length ;
    int n2 = i2.length ;
    int i = 0 , j = 0 ;
    while(i < n1 && j < n2)
    {
        int a = Math.max(i1[i][0],i2[j][0]);
        int b = Math.min(i1[i][1] , i2[j][1]);
        if(a <= b)
        {
            res.add(new int[]{a,b});
        }
        if(b == i1[i][1] )
        {
            i++;
        }else{
            j++;
        }
    }
    int[][] ans = new int[res.size()][2];
    for(i = 0 ; i < ans.length ; i++ )
    {
        ans[i][0] = res.get(i)[0];
        ans[i][1] = res.get(i)[1];
    }
    return ans ;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // Input format
    int n = scn.nextInt();
    int list1[][] = new int[n][2];
    for (int i = 0 ; i < n ; i++) {
      list1[i][0] = scn.nextInt();
      list1[i][1] = scn.nextInt();
    }

    int m = scn.nextInt();
    int list2[][] = new int[m][2];
    for (int i = 0 ; i < m ; i++) {
      list2[i][0] = scn.nextInt();
      list2[i][1] = scn.nextInt();
    }

    // output
    int ans[][] = intersection(list1, list2);
    System.out.print("[");
    for (int interval[] : ans) {
      System.out.print(Arrays.toString(interval));
    }
    System.out.println("]");
  }
}
