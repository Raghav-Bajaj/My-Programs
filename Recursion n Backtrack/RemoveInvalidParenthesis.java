import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str, int minRemoval, HashSet<String> ans) {
	    if(minRemoval == 0)
	    {
	        int sol = getMin(str);
	        if(sol == 0)
	        {
	            if(!ans.contains(str))
	            {
	                System.out.println(str);
	                ans.add(str);
	            }
	        }
	        return ;
	    }
	for(int i = 0 ; i < str.length() ; i++ )
	{
	    String one = str.substring(0,i);
	    String two = str.substring(i+1);
	    solution(one+two , minRemoval-1,ans);
	}
	}

	public static int getMin(String str){
	    Stack<Character> s = new Stack<>();
		for(int i = 0 ; i < str.length() ; i++ )
		{
		    char ch = str.charAt(i);
		    if(ch == '(')
		    {
		     s.push(ch);   
		    }else if(ch == ')' ){
		        if(s.size() == 0 || s.peek() == ')')
		            s.push(ch);
		          else
		            s.pop();
		    }
		}
		return s.size();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str, getMin(str),new HashSet<>());
	}
		
}
