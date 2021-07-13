import java.util.*;

public class Main {

	public static int solution(String str){
		HashSet<Character> set = new HashSet<>();
		for(int i = 0 ; i < str.length() ; i++)
		{
		    set.add(str.charAt(i));
		}
		int ans = 0 ; 
		int dans = set.size();
		int i = -1 ; 
		int j = -1 ;
		String res = "";
		HashMap<Character,Integer> map = new HashMap<>();
		while(true)
		{
		    boolean f1 = false ;
		    boolean f2 = false ;
		    while(i < str.length()-1 && ans < dans )
		    {
		        	
		        i++;
		        char ch = str.charAt(i);
		        map.put(ch , map.getOrDefault(ch , 0 ) + 1);
		        if(set.contains(ch) && map.get(ch) == 1 )
		            ans ++;
		      f1 = true ;
		    }
		    while( j < i && ans == dans)
		    {
		        String pp = str.substring(j+1 , i+1);
		      //  	System.out.println(pp);
		        if(res.length() == 0 || res.length() > pp.length())
		        {
		                res = pp ;
		          //  	System.out.println(pp);
		        }
		        j++;
		        char ch = str.charAt(j);
		        if(map.get(ch) == 1 )
		        {
		            map.remove(ch);
		        }else{
		            map.put(ch , map.get(ch) -1 );
		        }
		         if(set.contains(ch) && map.containsKey(ch) == false )
		                    ans --;
		        f2 = true ;
		    }
		    if(f1 == false  && f2 == false)
		    {
		        break ;
		    }
		}
// 		System.out.println(res);
		return res.length();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
