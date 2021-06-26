import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    int check = 1 ;
    check = check<<i;
    int one = n | check ;
    System.out.println(one);;
    int c2 = 1 ;
    c2 = c2 << j ;
    c2 = ~c2 ;
    int two = n & c2 ;
     System.out.println(two);
        int c3  = 1 ;
        c3 =c3<<k;
    int three = n ^ c3 ;
    System.out.println(three);
    int c4 = 1;
    c4 = c4<<m ;
    int four = n & c4 ;
    if(four == 0)
    {
        System.out.println(false);
    }else{
        System.out.println(true);
    }
  }

}
