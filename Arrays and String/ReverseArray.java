import java.util.Scanner;

public class Array_4_ReverseArray {
	public static void main(String args[])
	 {
		 int size, i ;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the no of size in array");
			size = sc.nextInt();
			
			int arr[] = new int[size];
			
			System.out.println("Enter the values for Array");
			
			for(i=0 ; i<arr.length ; i++)
			{
			 arr[i]=sc.nextInt();
		    }
			
			System.out.println("The Array no in reverse order is ");
			for(i=size-1 ; i>=0 ; i--)
			{
				System.out.println(arr[i]);
				
			}
			
		 
	 }
}
