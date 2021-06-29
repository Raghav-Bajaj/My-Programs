import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    boolean flag = false;
    String str = "";
    for(int i = 31 ; i >=0;i--  )
    {
        int mask = 1 << i ;
        if(flag)
        {
            if((n & mask)==0)
            {
                System.out.print("0");
                str = "0" + str ;
            }else{
                 str = "1" + str ;
              System.out.print("1");   
            }
        }else{
          if((n & mask ) !=  0){
              flag = true ;
              System.out.print("1"); 
              str = "1" + str ;
          }
        }
    }
    int decimal=Integer.parseInt(str,2);
     System.out.println(); 
     System.out.println(decimal);
     
  }

}
