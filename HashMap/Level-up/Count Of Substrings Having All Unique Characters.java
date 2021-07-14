import java.util.*;

public class Main {

	public static int solution(String str) {
	int i = -1 ;
		int j = -1 ;
		int count = 0 ;
		HashMap<Character , Integer> map = new HashMap<>();
		while(true)
		{
		    boolean f1 = false ;
		    boolean f2 = false ;
		  while( i < str.length()-1)
		  {
		       f1 = true ;
		      i++;
		      char ch = str.charAt(i);
		        map.put(ch , map.getOrDefault(ch,0)+1);
		      if(map.get(ch) == 2)
		      {
		          
		          break ;
		      }else{
		         
		          count += i-j ;
		         
		      }
		       
		      
		  }
		      while(j < i)
		      {
		          f2 = true ;
		          j++;
		          char ch = str.charAt(j);
		            map.put(ch , map.get(ch)-1); 
		          if(map.get(ch) == 1)
		          {
		                count += i - j ;
		              break ;
		          }
		      }
		  
		  if(f1 == false && f2 == false)
		  {
		      break ;
		  }
		  
		  
	}
	           
	return count ;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
