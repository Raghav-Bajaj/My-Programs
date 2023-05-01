package Array;

import java.util.Scanner;

public class Array_largest_number {
	public static void main(String args[])
	 {
		 int size, i; 
		 
		 
			Scanner sc = new Scanner(System.in);
			
			
			
			int arr[] = new int[5];
			System.out.println("Enter the values for Array");
			
			
			for(i=0 ; i<arr.length ; i++)
			{
			 arr[i]=sc.nextInt();
		    }
			
			int largest = arr[0];
			for(i=0 ; i<arr.length ; i++)
			{
				if(arr[i] > largest)
				{
				largest = arr[i];
				}	
			}
			
			
			System.out.println("The Largest number is " + largest);
	 }
}
