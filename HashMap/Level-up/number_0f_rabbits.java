import java.util.*;

public class Main {

    public static int solution(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : arr)
        {
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int res = 0 ;
        for(int val : map.keySet())
        {
            if(val != 0)
            {
               while(map.get(val) > val+1 )
               {
                   res += val + 1 ;
                   map.put(val , map.get(val) - (val+1) ) ;
               }
               res += val + 1 ;
            }else{
                res += map.get(val);
            }
            
        }
        return res;
    }
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}
