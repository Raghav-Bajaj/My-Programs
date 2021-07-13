import java.util.*;

public class Main {

	public static int solution(String str) {
		int i = -1 ;
		int j = -1 ;
		int ans = 0 ;
		char release = 'a';
		HashSet<Character> set = new HashSet<>();
		while(true)
		{
		    boolean f1 = false ;
		    boolean f2 = false ;
		  while( i < str.length()-1)
		  {
		       f1 = true ;
		      i++;
		      char ch = str.charAt(i);
		      if(set.contains(ch))
		      {
		          release = ch ;
		          break ;
		      }else{
		          set.add(ch);
		          if(set.size() > ans )
		          {
		              ans = set.size();
		          }
		         
		      }
		       
		      
		  }
		      while(j < i)
		      {
		          f2 = true ;
		          j++;
		          char ch = str.charAt(j);
		          if(ch == release)
		          {
		              break ;
		          }else{
		            set.remove(ch);   
		          }
		      }
		  
		  if(f1 == false && f2 == false)
		  {
		      break ;
		  }
		  
		  
	}
	           
	return ans ;
		}
		
		

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
