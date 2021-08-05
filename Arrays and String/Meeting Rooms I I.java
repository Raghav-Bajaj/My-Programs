import java.util.*;


public class Main {
  public static int meetingRooms(int intervals[][]) {
    Arrays.sort(intervals , (a,b)->Integer.compare(a[0],b[0]));
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int[] interval : intervals)
    {
        if(pq.size() == 0 )
        {
            pq.add(interval[1]);
        }else{
            if(pq.peek() > interval[0])
            {
                pq.add(interval[1]);
            }else{
                pq.remove();
                 pq.add(interval[1]);
            }
        }
    }
    return pq.size();
  }
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);

    // Input Format
    int n = scn.nextInt();
    int input[][] = new int[n][2];

    for (int i = 0 ; i <  n ; i++) {
      int sp = scn.nextInt();
      int ep = scn.nextInt();

      input[i][0] = sp;
      input[i][1] = ep;
    }

    // Output Format
    System.out.println(meetingRooms(input));
  }
}
