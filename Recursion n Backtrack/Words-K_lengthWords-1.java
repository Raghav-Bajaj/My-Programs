import java.io.*;
import java.util.*;

public class Main {

 

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }
     combinations(0 , ustr ,0, k ,new Character[k] );
  }
  public static void  combinations(int ct ,String set ,int ssf, int k , Character[] asf )
  {
         if(ssf == k  || ct == set.length())
         {
             if(ssf == k)
             {
                      for(char ch : asf)
       {
           System.out.print(ch);
       }
       System.out.println(); 
             }
 
               return ;
         }
       
     
     
     char ch = set.charAt(ct);
     for(int i = 0 ; i < k ; i++)
     {
         if(asf[i] == null)
         {
             asf[i] = ch ;
             combinations(ct+1 , set ,ssf+1, k , asf);
             asf[i] = null ;
         }
     }
    
      
      combinations(ct+1 , set ,ssf, k , asf);
  }

}
