import java.util.*;

public class Main {
	
	public static void solution(int[] arr, int k){
		HashMap<Integer , Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < arr.length ; i++)
		{
		    int temp = arr[i] ;
		    temp = temp % k ;
		    map.put(temp ,map.getOrDefault(temp , 0)+1);
		}
        for(int val : map.keySet())
        {
            if(val == 0 )
            {
             if(map.get(val)%2 != 0 )
             {
                    System.out.println(false);
                return ;
             }
                
            }else if(k%2 == 0 && val == k/2)
            {
                 if(map.get(val)%2 != 0 )
             {
                    System.out.println(false);
                return ;
             }
            }else{
            if(map.containsKey(k - val))
            {
                if(map.get(val) != map.get(k-val))
                {
                System.out.println(false);
                return ;
                }
                
            }else{
                System.out.println(false);
                return ;
            }
            }
        }
          System.out.println(true);
         
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		solution(arr,k);
	}

}
