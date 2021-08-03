import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static int[] getModifiedArray(int length, int[][] queries) {
//       approch1
        // write your code here
        // int[] sol = new int[length];
        // int i = 0 ;
        // while(i < queries.length)
        // {
        //     int s = queries[i][0];
        //     int e = queries[i][1];
        //     int inc = queries[i][2];
        //     while(s <= e)
        //     {
        //         sol[s] += inc ;
        //         s++;
        //     }
        //     i++;
        // }
        // return sol ;
        
//       approch 2
                int[] sol = new int[length+1];
        int i = 0 ;
        while(i < queries.length)
        {
            int s = queries[i][0];
            int e = queries[i][1];
            int inc = queries[i][2];
            
                sol[s] += inc ;
                sol[e+1] -= inc ;
            
            i++;
        }
        int[] sum = new int[length];
        sum[0] = sol[0] ;
        for( i = 1 ; i < length ; i++)
        {
            sum[i] = sum[i-1]+sol[i];
        }
        return sum ;
    }

   

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int length = scn.nextInt();

        int nq = scn.nextInt();
        
        int[][] queries = new int[nq][3];

        for(int q = 0; q < nq; q++) {
            queries[q][0] = scn.nextInt();
            queries[q][1] = scn.nextInt();
            queries[q][2] = scn.nextInt();
        }


        int[] res = getModifiedArray(length, queries);

        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

