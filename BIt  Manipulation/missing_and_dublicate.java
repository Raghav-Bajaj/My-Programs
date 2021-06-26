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
  int dub= 0  ;
  Arrays.sort(arr);
  for(int i = 0 ; i < arr.length-1 ; i++)
  {
      if(arr[i] == arr[i+1])
      {
          dub = arr[i];
          break ;
      }
  }
   int num = 0 ;
for(int i = 0 ; i < arr.length ; i++)
{
    num = ((arr[i] ^(i+1))^num);
}
num = num ^ dub ;
System.out.println("Missing Number -> " + num);
System.out.println("Repeating Number -> " + dub);
  }

}
