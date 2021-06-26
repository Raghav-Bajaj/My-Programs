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
int num = 0 ;
for(int i : arr)
{
    num = num ^ i ;
}
int res = num & - num ;

int num1 = 0;
int num2 = 0 ;
for(int i : arr)
{
  
    if((i & res) == 0)
    {
        num1 = num1 ^ i ;
    }else{
      num2 = num2 ^ i ;
    }
}

   System.out.println(Math.min(num1,num2));
   System.out.println(Math.max(num1,num2));
  }

}
