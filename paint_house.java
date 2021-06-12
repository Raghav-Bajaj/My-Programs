import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] red = new int[n];
         int[] blue = new int[n];
          int[] green = new int[n];
          for(int i = 0 ; i < n ; i++)
          {
              red[i] = sc.nextInt();
               blue[i] = sc.nextInt();
                green[i] = sc.nextInt();
          }
        
          int red_in = red[0];
          int blue_in = blue[0] ;
          int green_in = green[0];

          for(int i = 1 ; i < n ; i++)
          {
            int temp1 = red_in ;
            int temp2 = blue_in ;
            int temp3 = green_in ;
            red_in = Math.min(temp2,temp3)+red[i] ;
            blue_in = Math.min(temp1,temp3)+blue[i];
            green_in = Math.min(temp2,temp1)+green[i];
          }
          int res = Math.min(red_in,Math.min(green_in,blue_in));
          System.out.println(res);
    }
}
