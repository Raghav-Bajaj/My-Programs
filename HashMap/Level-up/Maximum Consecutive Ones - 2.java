import java.util.*;

public class Main {

    public static int solution(int[] arr, int k){
    int n = arr.length ;    
    HashMap<Integer,Integer> map = new HashMap<>();
    int i = -1 ;
    int j = -1 ;
    int ans = 0 ;
    while(true)
    {
        boolean f1 = false ;
        boolean f2 = false ;
        while(i < n-1)
        {
            f1 = true ;
            i++;
            map.put(arr[i] , map.getOrDefault(arr[i] , 0 ) + 1 ) ;
            if(map.getOrDefault(0,0) > k)
            {
                break ;
            }
                if(i - j > ans)
                {
                    ans = i - j ;
                }
            
        }
        if(ans == n)
        {
            return n ;
        }
        while(j < i )
        {
            j++;
             map.put(arr[j] , map.getOrDefault(arr[j] , 0 ) - 1 ) ;
             if(map.get(0) == k)
             {
                 break ;
             }
        }
        if(f1 == false && f2 == false)
        {
            break ;
        }
    }
        return ans;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solution(arr,k));
	}

}
