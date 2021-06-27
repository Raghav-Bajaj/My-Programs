import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   int tn = Integer.MAX_VALUE , tnp1 = 0 , tnp2 = 0 ;
   for(int i = 0 ; i < arr.length ; i++)
   {
       int ctn = tn & arr[i] ;
       int ctnp1 = tnp1&arr[i] ;
       int ctnp2 = tnp2&arr[i] ;
       
       tn = tn & (~ctn);
       tnp1 = tnp1 | ctn ;
       
         tnp1 = tnp1 & (~ctnp1);
       tnp2 = tnp2 | ctnp1 ;
       
         tnp2 = tnp2 & (~ctnp2);
       tn = tn | ctnp2 ;
       
   }
   System.out.println(tnp1);
  }

}
