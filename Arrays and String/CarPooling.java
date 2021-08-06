import java.util.*;

public class Main {
  public static boolean carPooling(int trips[][], int cap) {
      if(trips.length == 0)
        return true ;
    Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));
    int[] res = new int[trips[trips.length -1][1]+1];
    int idx = 0 ;
    while(idx < trips.length)
    {
        res[trips[idx][0]]+=trips[idx][2];
        res[trips[idx][1]]-=trips[idx][2];
        idx++;
        
    }
    for(int i = 1 ; i < res.length ; i++)
    {
        res[i] += res[i-1];
        if(res[i] > cap)
            return false ;
    }
    return true ;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int trips[][] = new int[n][3];
    for (int i = 0 ; i < n ; i++) {
      trips[i][0] = scn.nextInt();
      trips[i][1] = scn.nextInt();
      trips[i][2] = scn.nextInt();
    }
    int cap = scn.nextInt();

    if (carPooling(trips, cap)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}
