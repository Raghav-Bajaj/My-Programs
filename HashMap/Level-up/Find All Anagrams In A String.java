import java.util.*;

public class Main {
	public static void findAnagrams(String s, String p) {
       HashMap<Character,Integer> mp = new HashMap<>();
       for(int i = 0 ; i < p.length() ; i++ )
       {
           char ch = p.charAt(i);
           mp.put(ch , mp.getOrDefault(ch,0)+1);
       }
        HashMap<Character,Integer> ms = new HashMap<>();
       for(int i = 0 ; i < p.length() ; i++ )
       {
           char ch = s.charAt(i);
           ms.put(ch , ms.getOrDefault(ch,0)+1);
       }
       
       int i = p.length();
       int count = 0 ;
        String res = "";
       while(i < s.length())
       {
           if(check(ms,mp))
           {
               count++;
               res += (i-p.length()) + " " ;
           }
           
           char inc = s.charAt(i);
              ms.put(inc , ms.getOrDefault(inc,0)+1);
        char exc = s.charAt(i- p.length());
              ms.put(exc , ms.getOrDefault(exc,0)-1);
             i++;
       }
         if(check(ms,mp))
           {
               count++;
               res += (i-p.length()) + " " ;
           }
           System.out.println(count);
             System.out.println(res);
	}
    public static boolean check(HashMap<Character,Integer> ms , HashMap<Character,Integer> mp)
    {
        for(char ch : mp.keySet())
        {
            if(ms.getOrDefault(ch,0) != mp.get(ch))
                return false ;
        }
        return true ;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String p = scn.next();
		findAnagrams(s, p);
	}

}
