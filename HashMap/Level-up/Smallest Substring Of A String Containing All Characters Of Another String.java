import java.util.*;

public class Main {

	public static String solution(String s1, String s2){
    HashMap<Character , Integer > map2 = new HashMap<>();
    for(int  i = 0 ; i  < s2.length() ; i++)
    {
        char ch = s2.charAt(i);
        map2.put(ch , map2.getOrDefault(ch , 0)+1);
    }
    int ans = 0 ;
    int dans = s2.length();
    int i = -1 ; 
    int j = -1 ;
    String res = "";
    HashMap<Character , Integer > map1 = new HashMap<>();
    while(true)
    {
        boolean f1 = false ;
        boolean f2 = false ;
        while(i < s1.length()-1 && ans < dans)
        {
                i++;
             char ch = s1.charAt(i);
        map1.put(ch , map1.getOrDefault(ch , 0)+1);
        if(map1.getOrDefault(ch , 0) <= map2.getOrDefault(ch , 0))
        {
            ans++ ;
        }
        f1 = true ;
        }
        while(j < i && ans == dans)
        {
            String ss = s1.substring(j+1 , i+1);
            if(res.length() == 0 || res.length() > ss.length() )
            {
                res = ss ;
            }
                j++;
             char ch = s1.charAt(j);
             if(map1.get(ch) == 1)
             {
                 map1.remove(ch);
             }else{
                 map1.put(ch , map1.get(ch)-1);
             }
        if(map1.getOrDefault(ch , 0) < map2.getOrDefault(ch , 0))
        {
            ans-- ;
        }
        f2 = true ;
        }
        if(f1 ==  false && f2 == false)
        {
            break ;
        }
    }
		
		return res;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1,s2));
	}

}
