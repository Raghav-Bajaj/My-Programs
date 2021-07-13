import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int noofpairs_src_des = scn.nextInt();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < noofpairs_src_des; i++) {
			String s1 = scn.next();
			String s2 = scn.next();
			map.put(s1, s2);	
		}

		//write your code here
		HashMap<String , Boolean> ss = new HashMap<>(); 
		
	for(String s : map.keySet())
	{
	    if(ss.containsKey(s) == false)
	    {
	        ss.put(s , true);
	    }
	    
	    ss.put(map.get(s) , false ) ;
	}
	String start = "" ;
    for( String s : ss.keySet()){
        if(ss.get(s) == true )
        {
            start = s ;
            break ;
        }
    }
    while(map.containsKey(start) == true )
    {
        System.out.print(start + " -> " );
        start = map.get(start);
    }
    System.out.print(start + "." );
	}
}
