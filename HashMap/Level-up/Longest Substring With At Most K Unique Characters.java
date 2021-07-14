import java.util.*;

public class Main {

	public static int solution(String str, int k) {
	int ans = 0 ;
	int n = str.length();
	int i = -1 ;
	int j = -1 ;
	HashMap<Character , Integer> map = new HashMap<>();
	while(true)
	{
	    boolean f1 = false ;
	    boolean f2 = false ;
	    while(i < n -1)
	    {
	        f1 = true ;
	        i++;
	        char ch = str.charAt(i);
	        map.put(ch,map.getOrDefault(ch,0)+1);
	     if(map.size() <= k)
	        {
	            if(i - j > ans)
	            {
	                ans = i - j ;
	            }
	        }else{
	            break ;
	        }
	    }
	    while(j < i)
	    {
	        j++;
	        f2 = true ;
	        char ch =  str.charAt(j);
	        if(map.get(ch) == 1 )
	        {
	            map.remove(ch);
	        }else{
	             map.put(ch,map.getOrDefault(ch,0)-1);
	        }
	        if(map.size() == k)
	        {
	            break ;
	        }
	    }
	    if(f1 == false && f2 == false)
	    {
	        break ;
	    }
	}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}
