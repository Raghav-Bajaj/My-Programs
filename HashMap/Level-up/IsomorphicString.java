import java.util.*;

public class Main {

	public static boolean isIsomorphic(String s, String t) {
	    if(s.length() != t.length())
	            return false ;
		HashMap<Character,Character> map = new HashMap<>();
		for(int i = 0 ; i  < s.length() ; i++ )
		{
		    char c = s.charAt(i);
		    char d = t.charAt(i);
		    if(map.containsKey(c))
		    {
		     if(map.get(c) != d )
		        return false ;
		    }else{
		        map.put(c,d);
		    }
		}
		 map = new HashMap<>();
		 
		for(int i = 0 ; i  < s.length() ; i++ )
		{
		    char c = s.charAt(i);
		    char d = t.charAt(i);
		    if(map.containsKey(d))
		    {
		     if(map.get(d) != c )
		        return false ;
		    }else{
		        map.put(d,c);
		    }
		}

		return true;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String A = scn.next();
		String B = scn.next();
		System.out.print(isIsomorphic(A, B));
	}

}
