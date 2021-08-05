import java.util.*;

public class Main {

  public static String addStrings(String num1, String num2) {
    char[] one = num1.toCharArray();
    char[] two = num2.toCharArray();
    int n1 = one.length ;
    int n2 = two.length ;
    int i = n1-1 , j = n2-1 , carry = 0 ;
    int k = Math.max(n1,n2) ;
    int[] res = new int[Math.max(n1,n2)+1];
    while(i >= 0 || j >= 0 )
    {
        int t1 = i >= 0 ? one[i] - '0' : 0 ;
        int t2 = j >= 0 ? two[j] - '0' : 0 ;
        int ans = t1 + t2 + carry ;
        res[k] = ans%10 ;
        carry = ans/10 ;
        k-- ;
        i--;
        j-- ;
    }
    k = 0 ;
    while(res[k] == 0)
    {
        k++;
    }
    StringBuilder sol = new StringBuilder("");
    while(k < res.length)
    {
        sol.append(res[k]) ;
        k++ ;
    }
    return sol.toString();
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String n1 = scn.nextLine();
    String n2 = scn.nextLine();

    String res = addStrings(n1, n2);
    System.out.println(res);
  }
}
