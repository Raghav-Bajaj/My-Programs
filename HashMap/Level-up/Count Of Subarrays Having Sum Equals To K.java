import java.util.*;

public class Main {

	public static int solution(int[] arr, int k){
	int count = 0 ;
	int sum = 0 ;
	HashMap<Integer,Integer> map = new HashMap<>();
	map.put(0,1);
	for(int i = 0 ; i < arr.length ; i++)
	{
	    sum += arr[i] ;
	    int var = sum - k  ;
	    if(map.containsKey(var))
	    {
	        count += map.get(var);
	    }
	    map.put(sum , map.getOrDefault(sum,0)+1);
	}
	
	
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(solution(arr,target));
	}

}
