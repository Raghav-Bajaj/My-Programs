public class Array_descending_order 
{
	 public static void main(String args[])
	 {
		 int temp;
			int a[] = {30,20,50,60,10};
			for(int i=0 ; i<a.length ; i++)
			{
			System.out.println(a[i]);	
			}
			
			for(int i=0 ; i<a.length ; i++)
			{
			   for(int j=i+1 ; j<a.length ;j++)
			   {
				   
			   if(a[i] < a[j])
			   {
				   temp = a[i];
				   a[i] = a[j];
				   a[j] = temp;
			   }
			   
			   }
			   
			}
		 
		 
			System.out.println(" Descending order of  Array ");
			for(int k=0; k<a.length ; k++) 
			{
				System.out.println(a[k]);
			}	 
	   }
	}

