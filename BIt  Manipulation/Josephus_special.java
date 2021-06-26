import java.io.*;
import java.util.*;

public class Main {
        public static int Power(int n)
        {
            int i = 1 ;
            while(i*2 <= n)
            {
                i = i *2;
            }
            return i ;
        }
  public static int solution(int n){
    int hp = Power(n);
    int l = n - hp;
   return 2*l +1 ;
 
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }
  
   
}
