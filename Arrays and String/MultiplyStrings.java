import java.util.*;

public class Main {

  // ~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static String multiplication(String num1, String num2) {
    int n1 = num1.length();
    int n2 = num2.length();
   int[] res = new int[n1+n2];
   char[] one = num1.toCharArray();
   char[] two = num2.toCharArray();
  int i = one.length-1 ;
   int pow = 0 ;
  int carry = 0 ; 
  while(i >=0 )
  {
      int a = one[i] - '0';
     
      int j = two.length-1 ;
      int k = res.length -1 - pow ;
      while(j >= 0 || carry != 0)
      {
          int b  = j >=0 ? two[j] - '0' : 0 ;
          int num = a * b + carry + res[k];
          res[k] = num%10 ;
          carry = num/10 ;
          k-- ;
          j-- ;
      }
      pow++;
      i-- ;
  }
  int j = 0 ;
  while(res[j] == 0)
  {
      j++ ;
  }
  StringBuilder ans = new StringBuilder("");
  while(j < res.length)
  {
      ans.append(res[j]);
      j++;
  }
  return ans.toString();
  }

  //~~~~~~~~~~~~Input Management~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String str1 = scn.nextLine();
    String str2 = scn.nextLine();

    String res = multiplication(str1, str2);
    System.out.println(res);
  }
}
