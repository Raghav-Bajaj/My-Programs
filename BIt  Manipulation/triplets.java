import java.io.*;
import java.util.*;

public class Main {

	public static void solution(int[] arr){
	    int count = 0 ;
		for(int i = 0 ; i < arr.length-1 ; i++)
		{
		    int numb = arr[i] ;
		    for(int j = i+1 ; j < arr.length ; j++)
		    {
		        numb = numb ^ arr[j];
		        if(numb == 0)
		        {
		         count+=(j-i);   
		        }
		    }
		  
		}
		  System.out.println(count);
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        solution(arr);
    }
	
	
}
