import java.io.*;
import java.util.*;

public class Main {

    public static int solution(int n) {
        int count = 0 ;
        long m = n ;
            while(m != 1)
            {
                       if(m%2 == 0)
                       {
                               m = m/2 ;
                       }else if(m == 3)
                       {
                           m = m -1 ;
                       }else if((m & 3)==3)
                {
                    m  = m + 1 ;
                }else{
                    m = m - 1 ; ;
                }
                count++;
            }
           
        return count ;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        System.out.println(solution(n));
    }
	
	
}
