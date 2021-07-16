import java.util.*;

public class Main {

    public static int solution(int[] arr, int k) {
           HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0,1);
       int sum = 0 ;
       int ans = 0 ;
       for(int i = 0 ; i  < arr.length ; i++)
       {
           sum += arr[i] ;
           int temp = sum % k ;
           
           if(temp < 0)
           {
               temp +=k ;
           }
           if(map.containsKey(temp))
           {
           
           
                ans += map.get(temp); 
           }
           map.put(temp , map.getOrDefault(temp , 0)+1 ) ;
            
       }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solution(arr, k));
    }

}
