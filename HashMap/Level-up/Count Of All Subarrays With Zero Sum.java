import java.util.*;

public class Main {
	
	public static int solution(int[] arr) {
	HashMap<Integer,Integer> map  = new HashMap<Integer,Integer>();
	int count = 0 ;

        int sum = 0 ;
        map.put(0,1);
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i] ;
            if(map.containsKey(sum))
            {
                count += map.get(sum) ;
               map.put(sum , map.get(sum) + 1);
            }else{
                map.put(sum , 1); 
            }
            
        }
        // for(int val : map.keySet())
        // {
        //     if(map.get(val) > 1 )
        //     {
        //         count += map.get(val) ;
        //     }
        // }
		return count;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}
