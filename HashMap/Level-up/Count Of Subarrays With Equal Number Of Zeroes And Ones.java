import java.util.*;

public class Main {

    public static int solution(int[] arr) {
        for(int  i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0 )
            {
                arr[i] = -1 ;
            }
        }
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0, 1);
       int temp = 0 ;
       int ans = 0 ;
       for(int i = 0 ; i  < arr.length ; i++)
       {
           temp += arr[i] ;
           
          
           if(map.containsKey(temp))
           {
             
                ans +=  map.get(temp) ;
           }
           map.put(temp , map.getOrDefault(temp , 0)+1);
       }
        return ans ;
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
