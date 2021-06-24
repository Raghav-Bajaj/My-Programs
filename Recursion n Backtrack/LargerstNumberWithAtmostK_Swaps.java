import java.io.*;
import java.util.*;

public class Main {

	static String max;
	public static void findMaximum(String str, int k) {
	   if(Integer.parseInt(str) > Integer.parseInt(max))
	   {
	       max = str ;
	   }
	   
	if(k == 0 )
	{
	    
	    return ;
	}
	
	for(int i = 0 ; i < str.length()-1 ; i++)
	{  char ch = str.charAt(i);
	    for(int j = i +1 ; j < str.length() ; j++)
	    {
	        if(ch < str.charAt(j))
	        {
	              char replace = str.charAt(j);
	        String srr = str.substring(0, i) + replace
              + str.substring(i+1,j) + ch + str.substring(j+1);
	         findMaximum(srr , k-1 );

	        
	        }
	    }
	   
	}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		 max = str;
		findMaximum(str, k);
		System.out.println(max);
	}

}
