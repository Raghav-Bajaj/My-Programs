import java.io.*;
import java.util.*;

public class Main {
    public static  boolean ispalindrome(String s)
    {
        int  i = 0 ; 
        int j = s.length()-1 ;
        while(i < j)
        {
            if(s.charAt(i)!= s.charAt(j))
                    return false ;
            i++;
            j--;
        }
        return true ;
    }
	public static void solution(String str, String asf) {
	
	if(str.length() == 0)
	{
	    System.out.println(asf);
	    return ;
	}
	for(int i = 0 ; i < str.length() ; i++)
	{
	    String pre = str.substring(0,i+1);
	    if(ispalindrome(pre))
	    {
	       String post = str.substring(i+1);
	       solution(post , asf + "(" + pre + ") ");
	    }
	}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		solution(str, "");
	}

}
