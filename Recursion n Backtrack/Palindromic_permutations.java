import java.io.*;
import java.util.*;

public class Main {

	public static void generatepw(int cs, int ts, HashMap<Character, Integer> fmap, Character oddc, String asf) {
	    if(cs> ts)
	    {
	        String str = "" ;
	        for(int i = asf.length() - 1 ; i >=0 ; i--)
	        {
	            str+=asf.charAt(i);
	        }
	        if(oddc != null)
	        {
	            asf+=oddc ;
	        }
	        System.out.print(asf);
	        System.out.print(str);
	        System.out.println();
	        return ;
	    }
	  for(char ch : fmap.keySet())
	  {
	      int f = fmap.get(ch);
	      if(f > 0)
	      {
    	       fmap.put(ch,f-1);
    	      generatepw(cs+1,ts ,fmap,oddc,asf+ch);
    	      fmap.put(ch,f);
	      }
	     
	      
	  }
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		HashMap<Character, Integer> fmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
		}
		
		Character odd = null ;
		int odds = 0 ;
		int len = 0 ;
		for(char ch : fmap.keySet())
		{
		    if(fmap.get(ch)%2 == 1)
		      {
		          odds++;
		          odd = ch ;
		      }
		        fmap.put(ch , fmap.get(ch)/2);
		        len += fmap.get(ch) ;
		}
		
		if(odds > 1)
		{
		    System.out.println(-1);
		    return;
		}
		
		generatepw(1,len ,fmap, odd , "");
	}
	
}
