import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    if((n&n-1)>0)
    System.out.println("false");
    else
    System.out.println(true);
    
  }

}
