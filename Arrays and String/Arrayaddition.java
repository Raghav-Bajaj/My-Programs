import java.util.Scanner;

public class Array_2D_Addition {

	public static void main(String args[])
	 {
		 int a[][] = new int[5][2];
		 int b[][] = { {10,20} , {30,40} , {50,60}, {25,61}, {81,70} } ; 
		 
		 Scanner sc = new Scanner(System.in);
			
		 for(int i=0 ; i<5 ;i++)
		 {
			for (int j=0 ; j<2 ;j++)
			{
				System.out.println("Enter the values");
				a[i][j] = sc.nextInt();
			}
		 }
		 
		 System.out.println("The array is");
		 for(int i=0 ; i<5 ; i++)
		 {
			for (int j=0; j<2 ; j++)
			{
				System.out.print(a[i] [j] + " ");
			}
		 
		 
		 System.out.println();
		 }
		 
		 System.out.println("Addition of Array is");
		 for(int i=0 ; i<5 ; i++)
		 {
			 for (int j=0; j<2 ; j++)
			 {
				
				System.out.print(a[i] [j] + b[i] [j] + " "); 
			 }
		 System.out.println();
		 }
		 
	 }
	}

