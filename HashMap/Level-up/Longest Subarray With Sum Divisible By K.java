import java.util.*;

public class Main {

    public static int solution(int[] arr, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0,-1);
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
            if(ans < i - map.get(temp))
            {
                ans = i - map.get(temp) ;
            }
           }else{
               map.put(temp , i);
           }
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
