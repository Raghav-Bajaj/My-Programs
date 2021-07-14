import java.util.*;

public class Main {

	public static int solution(String str, int k) {
	int count = 0 ;
	int n = str.length();
	int i = -1 ;
	int j = -1 ;
	
	HashMap<Character , Integer> map = new HashMap<>();
	while(true)
	{
	    while(i < n -1)
	    {
	     
	        i++;
	        char ch = str.charAt(i);
	        map.put(ch,map.getOrDefault(ch,0)+1);
	     if(map.size() <= k)
	        {
	            
	                count += i - j ;
	            
	        }else{
	            break ;
	        }
	    }
	     if(i == str.length() -1 && map.size() <=k)
	    {
	        break ;
	    }
	    while(j < i)
	    {
	        j++;
	      
	        char ch =  str.charAt(j);
	        if(map.get(ch) == 1 )
	        {
	            map.remove(ch);
	        }else{
	             map.put(ch,map.getOrDefault(ch,0)-1);
	        }
	        if(map.size() <= k)
	        {
	             count += i - j ;
	            break ;
	        }
	    }
	   
	    
	}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}
