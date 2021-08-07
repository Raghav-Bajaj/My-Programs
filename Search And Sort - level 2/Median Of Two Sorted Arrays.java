import java.util.*;
import java.io.*;

public class Main {

    public static double find(int[]a1,int[]a2) {
        int n  = a1.length + a2.length ;
        int lo = 0 ;
        int hi = a1.length ;
        while(lo < hi)
        {
            int am = (lo+hi)/2 ;
            int bm = (n + 1)/2 - am ;
            int c = am == 0 ? Integer.MIN_VALUE : a1[am-1];
            int d = am == a1.length  ? Integer.MAX_VALUE : a1[am];
            int e = bm == 0 ? Integer.MIN_VALUE : a2[bm-1];
            int f = bm == a2.length  ? Integer.MAX_VALUE : a2[bm];
            if(c < f && e < d)
            {
                if(n%2 == 0)
                {
                    int a = Math.max(c,e);
                int b = Math.min(d,f);
                return (a+b)/(2.0);
                }else{
                    return Math.max(c,e)*1.0;
                }
               
            }else if(c > f)
            {
                hi = am -1 ;
            }else{
                lo = am + 1 ;
            }
        }
        return 0;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        //input work
        int n1 = scn.nextInt();
        int[]a = new int[n1];

        for(int i=0;i < n1;i++){
            a[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[]b = new int[n2];

        for(int i=0; i < n2;i++) {
            b[i] = scn.nextInt();
        }

        double median = find(a,b);
        System.out.println(median);
    }
}
