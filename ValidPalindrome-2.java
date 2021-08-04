import java.util.*;

public class Main {

  // ~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~
  public static boolean validPalindrome(String s) {
    boolean check = false ;
    int i = 0 ;
    int j = s.length()-1;
    while(i < j)
    {
        char a = s.charAt(i);
        char b = s.charAt(j);
        if(a == b)
        {
            i++ ;
            j-- ;
        }else{
            {
                
                if(s.charAt(i+1) == b && check == false)
                {
                    i+=2;
                    j-- ;
                    check = true ;
                    
                }else if(s.charAt(j-1) == a && check == false){
                    j-=2;
                    i++;
                    check = true ;
                }else{
                    return false ;
                }
            }
        }
        
    }
    return true ;
  }

  // ~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    boolean res = validPalindrome(str);
    System.out.println(res);
  }
}
