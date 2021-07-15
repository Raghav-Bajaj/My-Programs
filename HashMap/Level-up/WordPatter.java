import java.util.*;

public class Main {

	public static boolean wordPattern(String pattern, String str) {
	String[] strs = str.split(" ");
	if(strs.length != pattern.length())
	        return false ;
	HashMap<Character , String> map = new HashMap<>();
	for(int i = 0 ; i < pattern.length() ; i++)
	{
	    char ch = pattern.charAt(i);
	    if(map.containsKey(ch))
	    {
	        if(map.get(ch).equals(strs[i]) == false)
	        {
	            return false ;
	        }
	    }else{
	        map.put(ch , strs[i]);
	    }
	}
		HashMap<String ,Character> mp = new HashMap<>();
	for(int i = 0 ; i < pattern.length() ; i++)
	{
	    String s = strs[i] ;
	       char ch = pattern.charAt(i);
	    if(mp.containsKey(s))
	    {
	        if(mp.get(s) != ch)
	        {
	            return false ;
	        }
	    }else{
	        mp.put(s , ch);
	    }
	}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String pattern = scn.nextLine();
		String words = scn.nextLine();
		System.out.println(wordPattern(pattern,words));
	}

}
