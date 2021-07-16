import java.util.*;

public class Main {

    public static boolean solution(int[] arr) {
        if(arr.length % 2 != 0 )
            return false ;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : arr)
            map.put(val,map.getOrDefault(val,0)+1);
        
        Integer[] ar = new Integer[arr.length];
        for(int i = 0 ; i < ar.length ; i++)
        {
            ar[i] = arr[i] ;
        }
        
      Arrays.sort(ar , (a,b)->{
          return Math.abs(a) - Math.abs(b) ;
      }) ;
      
        for(int i = 0 ; i < ar.length ; i++)
        {
            if(map.containsKey(ar[i]) && map.get(ar[i]) > 0)
            {
                if(map.containsKey(2*ar[i]) &&  map.get(2*ar[i]) > 0)
                {
                   
                        map.put(ar[i],map.get(ar[i])-1);
                 
                        map.put(2*ar[i],map.get(2*ar[i])-1);
                    
                }else{
                    return false ;
                }
            }
        }
        return true;
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
