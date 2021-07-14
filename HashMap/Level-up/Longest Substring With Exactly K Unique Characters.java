import java.util.*;

public class Main {

	public static int solution(String str, int k){
	    HashMap<Character , Integer> map = new HashMap<>();
	    int i = -1 ;
	    int j = -1 ;
	    int sz = 0 ;
	    int update = 0 ; 
	    while(true)
	    {
	        boolean f1 = false ;
	        boolean f2 = false ;
	        while(i < str.length() -1 )
	        {   i++;
	          f1 = true ;
	            char c = str.charAt(i);
	           
	            map.put(c,map.getOrDefault(c,0)+1);
	          if(map.size() < k )
	          {
	              continue ;
	          }else if(map.size() == k)
	          {
	              if(i-j > sz)
	              {
	                  sz = i -j ;
	              }
	          }else{
	              break ; 
	          }
	          
	        }
	        while(j < i  )
	        {   j++;
	         f2 = true ;
	           char c = str.charAt(j); 
	            if(map.get(c) == 1 )
	           {   
	               map.remove(c);
	           }else{
	               map.put(c , map.get(c) -1); 
	           }
	           if(map.size() > k )
	           {
	                continue ;
	           }else{
	                 if(i-j > sz)
	              {
	                  sz = i -j ;
	              }
	               break ;
	           }
	        }
	      if(f1 == false && f2 == false)
	      {
	          break ;
	      }
	    }

		return sz;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}
