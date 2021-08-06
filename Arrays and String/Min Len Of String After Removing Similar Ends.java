import java.util.Scanner;
public class Main {
  public static int minLen(String s) {
    
       int i = 0 , j = s.length()-1 ; 
       while(i < j)
       {
           if(s.charAt(i) == s.charAt(j))
           {
               i++;
               j-- ;
           }else{
               break ;
           }
           while(i < j && s.charAt(i) == s.charAt(i-1))
           {
               i++;
           }
           while(j > i && s.charAt(j) == s.charAt(j+1))
           {
               j--;
           }
       }
       
        return j-i+1 ;
    
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String inp = scn.nextLine();
    int len = minLen(inp);

    System.out.println(len);
  }
}
