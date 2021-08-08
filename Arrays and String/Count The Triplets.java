import java.util.*;
import java.io.*;

public class Main {

  public static int countTriplets(int[]arr) {
   int count = 0 ;
Arrays.sort(arr);
   int n = arr.length;
   for(int i = n-1 ; i >= 2 ; i--)
   {
       int j = 0 ;
       int k = i -1 ;
       while(j < k)
       {
         
           if(arr[j] + arr[k] == arr[i])
           {
             
               count++;
            k-- ;
            j++ ;
           }else  if(arr[j] + arr[k] > arr[i])
           {
               k--;
           }else{
               j++ ;
           }
       }
       
   }
  return count ;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println(countTriplets(arr));
  }
}
