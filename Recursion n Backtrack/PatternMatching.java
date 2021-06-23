import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str, String pattern, HashMap<Character,String> map, String op){
	if(pattern.length() == 0)
	{
	    if(str.length() == 0)
	    {
	        HashSet<Character> set = new HashSet<>();
	        for(int i = 0 ;  i< op.length() ; i++)
	        {
	            char c = op.charAt(i) ;
	            if(!set.contains(c))
	            {
	                System.out.print(c + " -> "+ map.get(c)+", ");
	                set.add(c);
	            }
	        }
	        System.out.println(".");
	    }
	    return ;
	}
	
	
	char ch = pattern.charAt(0);
	String z = pattern.substring(1);
	if(map.containsKey(ch))
	{
	    String one = map.get(ch);
	    if(one.length() <= str.length())
	    {
	        String left = str.substring(0 , one.length());
	        String right = str.substring(one.length());
	        if(one.equals(left))
	        {
	       solution(right,z,map,op);
	    }
	    }
	}else{
	  for(int i = 0 ; i < str.length() ; i++)
	{
	    String left = str.substring(0 , i+1);
	    String right = str.substring(i+1);
	    map.put(ch,left);
	     solution(right,z,map,op);
	    map.remove(ch);
	}  
	}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String pattern = scn.next();
		HashMap<Character,String> map = new HashMap<>();
		solution(str,pattern,map,pattern);
	}
}
