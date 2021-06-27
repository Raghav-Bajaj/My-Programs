import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();

    //write your code here
    int num = a ^ b ;
    int count = 0 ;
    while(num > 0)
    {
        int res = num & - num ;
        num = num - res ;
        count++;
    }
    
    System.out.println(count);
  }

}
