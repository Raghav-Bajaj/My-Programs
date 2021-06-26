import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    long i = 1 ;
    while(n > 0)
    {
        if(n%2 == 1)
        {
            System.out.println(i);
            return ;
        }
        i = i*10 ;
        n = n/2 ;
    }
  }

}
