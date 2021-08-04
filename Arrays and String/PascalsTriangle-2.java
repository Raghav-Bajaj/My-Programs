import java.util.*;

public class Main {

  // ~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~
  public static ArrayList<Integer> pascalRow(int r) {
      ArrayList<Integer> arr = new ArrayList<>();
       int val = 1 ;
   for(int i = 0 ; i <= r ; i++)
   {         arr.add(val);
            val = (val*(r-i))/(i+1);
          
       
   }
   return arr ;
  }

  // ~~~~~~~~~~~Input management~~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    ArrayList<Integer> res = pascalRow(n);
    for (int val : res) {
      System.out.print(val + " ");
    }
    System.out.println();
  }
}
