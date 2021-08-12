import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ;i++)
    {
        arr[i] = sc.nextInt();
    }
    int max = (int)Math.pow(2,n);
    for(int i = 0 ; i < max ; i++)
    {
        String ans = "";
        int p = i ;
        for(int j = n-1 ; j >= 0 ; j--)
        {
           int rem = p%2 ;
           p = p/2 ;
           if(rem == 1)
            {
               ans = arr[j] + "\t" + ans;
            }else{
                 ans = "-" + "\t" + ans ; 
            }
        }
        System.out.println(ans);
        {
            
        }
    }
    
 }

}
