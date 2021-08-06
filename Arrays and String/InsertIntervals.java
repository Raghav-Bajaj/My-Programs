import java.util.*;

public class Main {

  public static int[][] insertIntervals(int interval[][], int newi[]) {
    int n = interval.length ;
    int idx = 0 ;
    ArrayList<int[]> arr = new ArrayList<>();
    while(idx < n)
    {
        if(interval[idx][0] < newi[0])
        {
            arr.add(interval[idx]);
            idx++;
        }else{
            break ;
        }
    }
    if(arr.size() == 0 || newi[0] > arr.get(arr.size() -1 )[1] )
    {
        arr.add(newi);
    }else{
        int[] ab = arr.remove(arr.size() -1);
        ab[1] = Math.max(ab[1] , newi[1]);
        arr.add(ab);
    }
    while(idx < n)
    {
        
        int[] ab = arr.get(arr.size() -1);
        if(ab[1] >= interval[idx][0])
        {
            int[] bb = arr.remove(arr.size() -1);
              bb[1] = Math.max(bb[1] , interval[idx][1]); 
              arr.add(bb);
            
        }else{
            arr.add(interval[idx]);
        }
      idx++;
    }
    return arr.toArray(new int[arr.size()][]) ;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int intervalList[][] = new int[n][2];
    for (int i = 0 ; i < n ; i++) {
      int st = scn.nextInt();
      int et = scn.nextInt();

      intervalList[i][0] = st;
      intervalList[i][1] = et;
    }
    int newInterval[] = new int[2];
    newInterval[0] = scn.nextInt();
    newInterval[1] = scn.nextInt();

    int ans[][] = insertIntervals(intervalList, newInterval);

    System.out.print("[");
    for (int interval[] : ans) {
      System.out.print(Arrays.toString(interval));
    }
    System.out.println("]");

  }
}
