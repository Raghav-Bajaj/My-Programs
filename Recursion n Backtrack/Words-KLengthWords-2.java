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

   
       combinations(0 , ustr ,new HashSet<>(), k ,"" );
  }
  public static void  combinations(int ct ,String set ,HashSet<Character> used, int k , String asf )
  {
         if(ct == k)
         {
           System.out.println(asf);
               return ;
         }
       
     
     
    
     for(int i = 0 ; i < set.length() ; i++)
     {
          char ch = set.charAt(i);
         if(!used.contains(ch))
         {
             used.add(ch);
             combinations(ct+1 , set ,used, k , asf+ch);
            used.remove(ch);
         }
     }

  }

}
