import java.util.*;

public class Main {

    public static boolean solution(int[] arr) {
      HashSet<Integer> set = new HashSet<>();
      for(int i = 0 ; i < arr.length -1 ; i++)
      {
          for(int j = i+1 ; j < arr.length ; j++)
          {
              int sum = arr[i] + arr[j] ;
              if(set.contains(sum))
              {
                  return true ;
              }
              set.add(sum);
          }
      }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
