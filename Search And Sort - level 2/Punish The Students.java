import java.util.*;
import java.io.*;

public class Main {

  public static boolean shouldPunish(int[]roll, int[]marks, double avg) {
   int n = roll.length ;
    int count = 0 ;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (roll[j] > roll[j+1])
                {
                   count += 2 ;
                    int temp = roll[j];
                    roll[j] = roll[j+1];
                    roll[j+1] = temp;
                }
                int old_marks = 0 ;
    for(int i = 0 ; i < n ; i++)
    {
        old_marks += marks[i] ;
    }
    int n_mark = old_marks - count ;
    double n_avg = n_mark/(n*1.0);
    if(n_avg< avg)
        return false;
    return true ;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]roll = new int[n];

    for (int i = 0; i < n; i++) {
      roll[i] = scn.nextInt();
    }

    int[]marks = new int[n];

    for (int i = 0; i < n; i++) {
      marks[i] = scn.nextInt();
    }

    double avg = scn.nextDouble();

    System.out.println(shouldPunish(roll, marks, avg));
  }
}
