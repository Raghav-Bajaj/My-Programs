import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {
  public static int minArrows(int cordinates[][]) {
    Arrays.sort(cordinates , (a, b) -> Integer.compare(a[1], b[1]));
    
    //  ArrayList<int[]> res = new ArrayList<>();
    int count = 0 ;
    int max = -1 ;
    for(int[] cord : cordinates)
    {
        if(cord[0] > max)
        {
            max = cord[1] ;
            count++ ;
        }
    }
    // for(int[]  iv : res)
    // {
    //     System.out.println(iv[0] + " " + iv[1]);
    // }
    return count ;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // number of balloons
    int coordinates[][] = new int[n][2];
    for (int i = 0 ; i < n ; i++) {
      coordinates[i][0] = scn.nextInt();
      coordinates[i][1] = scn.nextInt();
    }

    System.out.println(minArrows(coordinates));
  }
}
