import java.util.*;

public class Main {

  // ~~~~~~~~~~User Section~~~~~~~~~~~
  public static String maximumSwap(String num) {
   char[] arr = num.toCharArray();
   int[] li = new int[10];
   for(int i = 0 ; i < arr.length ; i++)
   {
       int dig = arr[i] - '0' ;
       li[dig] = i ;
   }
   for(int i = 0 ; i < arr.length ; i++)
   {
         int dig = arr[i] - '0' ;
         for(int j = 9 ; j > dig ; j--)
         {
             if(i < li[j])
             {
                 char ch = arr[i];
                 arr[i] = arr[li[j]];
                 arr[li[j]] = ch ;
                 return new String(arr);
                 
             }
         }
   }
   return num ;
  }

  // ~~~~~~~~Input Management~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    String ans = maximumSwap(str);
    System.out.println(ans);
  }
}
