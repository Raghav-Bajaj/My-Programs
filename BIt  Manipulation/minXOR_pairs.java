import java.io.*;
import java.util.*;

public class Main {

    public static void solution(int[] arr) {
        Arrays.sort(arr);
       ArrayList<String> set = new ArrayList<>();
       int min = Integer.MAX_VALUE ;
       for(int i = 0 ; i < arr.length -1 ; i++)
       {
           for(int j = i+1 ; j < arr.length ;j++)
           {
               int num = arr[i]  ^ arr[j];
               if(num <= min)
               {
                  
                   if(num < min )
                   {
                     set = new ArrayList<>(); 
                   }
                    min = num ;
                   set.add(arr[i] + ", " + arr[j]);
               }
               
           }
       }
       for(String s : set)
       {
           System.out.println(s);
       }
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        solution(arr);
    }
    
    
}
