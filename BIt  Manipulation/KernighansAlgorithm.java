import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count = 0 ;
    while(n > 0)
    {
        int res = n & -n ;
         count++;
         n = n - res ;
    }
   System.out.println(count);
  }

}
