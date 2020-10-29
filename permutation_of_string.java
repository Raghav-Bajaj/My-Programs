// permutations of string


import java.io.*;
import java.lang.*;
import java.util.*;
class GFG {
    
    public static void permutations(char[] in , int i ){
        if( in[i] == '\u0000'){
            System.out.println(in);
            return;
            
        }
        for(int j = i ; in[j] != '\u0000' ; j++){
            char temp = in[i];
            in[i] = in[j];
            in[j] = temp ;
            permutations(in , i+1);
              temp = in[i];
            in[i] = in[j];
            in[j] = temp ;
        }
        


    }   
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		char[] in = sc.next().toCharArray();
		String A = new String(in);
		A += '\0' ;
		in = A.toCharArray();

		permutations(in  , 0);
		
	}
}
