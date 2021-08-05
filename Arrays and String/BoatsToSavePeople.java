import java.util.*;

public class Main {

  // ~~~~~~~~~~~User's Section~~~~~~~~~~~~
  public static int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);
    int count = 0 ; 
    int i = 0  , j = people.length-1 ;
    while(i < j)
    {
        int sum = people[i] + people[j] ;
        if(sum > limit)
        {
            count++ ;
            j-- ;
            
        }else {
             count++;
            i++;
            j--;
        }
    }
    if(i == j)
    {
        count++ ;
    }
    return count ;
  }

  // ~~~~~~~~~~Input Management~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] people = new int[n];

    for (int i = 0; i < n; i++)
      people[i] = scn.nextInt();

    int limit = scn.nextInt();
    int boats = numRescueBoats(people, limit);
    System.out.println(boats);
  }
}
