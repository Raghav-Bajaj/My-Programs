import java.io.*;
import java.util.*;

public class Main {

  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashMap<Character, Integer> unique = new HashMap<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.containsKey(ch) == false) {
        unique.put(ch, 1);
        ustr += ch;
      } else {
        unique.put(ch, unique.get(ch) + 1);
      }
    }

   combinations(0,k,ustr,unique,"");
  }
        public static void combinations(int ct , int k,String ustr , HashMap<Character, Integer> unique ,String asf)
        {
            if(k < 0)
            {
                return ;
            }
            if(ct == ustr.length())
            {
                if(k==0)
                {
                    System.out.println(asf);
                }
                return ;
            }
            char ch = ustr.charAt(ct);
            int  p = unique.get(ch) ;
            for(int i = p ; i >= 0 ; i--)
            {
                String gt = "";
                for(int j = 0 ; j < i ; j++)
                {
                    gt+=ch;
                }
                 combinations(ct+1,k-i,ustr,unique,asf+gt);
            }
        }
}
