import java.util.*;
import java.io.*;

public class Main {
  public static int countBuildings(int[]ht) {
   int count = 1 ;
   int lmax = ht[0];
   for(int val : ht)
   {
       if(val > lmax)
       {
           lmax = val ;
           count++ ;
       }
   }
    return count;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]ht = new int[n];

    for (int i = 0; i < n; i++) {
      ht[i] = scn.nextInt();
    }

    System.out.println(countBuildings(ht));
  }
}
