// tower of hanoi 

// subsequences
import java.io.*;
import java.lang.*;
import java.util.*;


class GFG {
    public static void subsequences(char[] in ,char[] out, int i , int j){
        if( in[i] == '\u0000'){
            out[j] = '\u0000';
            System.out.println(out);
            return;
            
        }
        out[j] = in[i];
        subsequences(in , out , i+1 , j+1);
        subsequences(in , out , i+1 , j);
        


    }   
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		char[] in = sc.next().toCharArray();
		String A = new String(in);
		A += '\0' ;
		in = A.toCharArray();
		char[] out = new char[in.length];
// 		if(out[0] == '\u0000')
// 		System.out.println(out);
		subsequences(in , out , 0 , 0);
		
	}
}
