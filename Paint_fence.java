import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n == 1)
        {
            System.out.print(k+k);
            return ;
        }else if(n == 2)
        {
            int res = k+k*(k-1);
            System.out.println(res);
            return ;
        }else{
            int one = k ;
            int two = k*(k-1);
            for(int i = 3 ; i <= n ; i++)
            {
                int temp = one ;
                one = two ;
                two = (two + temp)*(k-1) ;
            }
            int ans  = one + two ;
            System.out.println(ans);
        }
    }
}
