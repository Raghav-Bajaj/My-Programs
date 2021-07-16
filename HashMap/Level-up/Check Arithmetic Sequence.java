import java.util.*;

public class Main {

    public static boolean solution(int[] arr) {
        if(arr.length  < 3)
        {
            return true ;
        }
       int low = Integer.MAX_VALUE ;
       int high = Integer.MIN_VALUE ;
       HashSet<Integer> set = new HashSet<>();
       for(int i = 0 ; i  < arr.length ; i++)
       {
           set.add(arr[i]);
           if(low > arr[i])
           {
               low = arr[i] ;
           }
           if(high < arr[i])
           {
               high = arr[i] ;
           }
       }
            int n = arr.length ;
            int d = (high-low)/(n-1) ;
            for(int i = 0 ;i < n ; i++)
            {
                int t = low + i*d ;
                if(set.contains(t) == false )
                {
                    return false ;
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
