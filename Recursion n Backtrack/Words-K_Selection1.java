import java.io.*;
import java.util.*;

public class Main {


  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String st = scn.nextLine();
    int k = scn.nextInt();
    
    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for(char ch : st.toCharArray()){
        if(unique.contains(ch)== false){
            unique.add(ch);
            ustr+=ch;
        }
    }
    
    combination(0,ustr,0,k,"");
  }
  
  
  public static void combination(int i,String ustr,int ssf, int ts, String asf ){
     if(i == ustr.length() || ssf == ts )
     {
         if(ssf == ts)
         {
             System.out.println(asf);
         }
         return ;
     }
      
      char ch = ustr.charAt(i);
      combination(i+1 , ustr  , ssf +1 ,ts,asf+ch);
      combination(i+1 , ustr  , ssf,ts,asf);
      
  }

}
