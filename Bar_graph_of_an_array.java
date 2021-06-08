import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] arr = new int[n];
  int max = Integer.MIN_VALUE ;
  for(int i = 0 ; i < n ; i++)
  {
      arr[i] = sc.nextInt() ;
      if(max < arr[i])
        max = arr[i] ;
  }
  for(int i = max-1 ; i >=0 ; i--)
  {
      for(int j = 0 ; j < n  ; j++)
      {
          if(arr[j] >i )
          System.out.print("*	"); 
          else
           System.out.print("	");
      }
      System.out.println();
  }
 }

}


// input:
// 5
// 3
// 1
// 0
// 7
// 5
// output:
// 			*		
// 			*		
// 			*	*	
// 			*	*	
// *			*	*	
// *			*	*	
// *	*		*	*	
