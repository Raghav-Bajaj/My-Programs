import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int evm = 0xAAAAAAAA;
    int odm = 0x55555555;
    int odd = (n & evm);
    int even = (n & odm);
    odd>>=1;
    even<<=1;
    n = odd | even ;
    System.out.println(n);
    
  }

}
