import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ss = sc.next();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < ss.length() ; i++)
        {
            set.add(ss.charAt(i));
        }
        String res = "";
        for(char ch : set)
        {
            res+=ch ;
        }
        int  k = sc.nextInt();
        combinations(0 ,res ,k,"");
  }
  public static void  combinations(int ct ,String set , int k , String asf )
  {
     if(ct == set.length())
     {
         if(asf.length() == k )
         {
             System.out.println(asf);
         }
         return ;
     }
     
     
     char ch = set.charAt(ct);
      combinations(ct+1 , set , k , asf+ch);
      combinations(ct+1 , set , k , asf);
  }

}
