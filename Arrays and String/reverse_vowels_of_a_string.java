import java.util.*;

public class Main {
  // ~~~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static String reverseVowels(String s) {
   char[] arr = s.toCharArray();
   int i = 0 ;
   int j = arr.length -1 ;
   while(i < j)
   {
       while(isVowel(arr[i])==false)
       {
           i++;
       }
       while(isVowel(arr[j]) == false)
       {
           j--;
       }
       if(i < j)
       {
           char ch = arr[i] ;
           arr[i] = arr[j] ;
           arr[j] = ch ;
           i++;
           j--;
       }
   }
   return toString(arr);
   
  }
  public static String toString(char[] a)
    {
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
  
        return sb.toString();
    }
  public static boolean isVowel(char c)
  {
      if(c == 'a' || c == 'e' || c == 'i'|| c == 'o' || c == 'u')
      {
          return true ;
      }
      else if(c == 'A' || c == 'E' || c == 'I'|| c == 'O' || c == 'U')
      {
          return true ;
      }
      return false ;
  }

  // ~~~~~~~~~~~~Input Management~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    String res = reverseVowels(str);
    System.out.println(res);
  }
}
