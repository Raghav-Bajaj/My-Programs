import java.util.*;

public class Main {
	
	public static int solution(int[] arr) {
	HashMap<Integer,Integer> map  = new HashMap<Integer,Integer>();
	int large = 0 ;

        int sum = 0 ;
        int temp = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i] ;
            if(map.containsKey(sum))
            {
               temp = i - map.get(sum) ;
               if(temp > large)
               {
                   large = temp ;
               }
            }else{
                map.put(sum , i); 
            }
            
        }
        // for(int val : map.keySet())
        // {
        //     System.out.println()
        // }
		return large;
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
