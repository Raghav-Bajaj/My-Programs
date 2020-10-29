// tower of hanoi 


import java.io.*;
import java.lang.*;
import java.util.*;


class GFG {
    public static void tower_of_hanoi(int n , char source , char helper , char destination){
        if(n == 0){
            return ;
        }
        
        tower_of_hanoi(n-1 , source , destination , helper);
        System.out.println(n + "th is moved from "+source + " to " + destination );
        tower_of_hanoi(n-1 , helper , source , destination);
    }   
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of discs");
		int n = sc.nextInt();
		char a = 'A' , b = 'B' , c = 'C' ; 
		tower_of_hanoi(n , a , b , c );
	}
}
