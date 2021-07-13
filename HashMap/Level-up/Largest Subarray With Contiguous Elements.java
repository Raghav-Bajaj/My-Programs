import java.util.*;

public class Main {

	public static int solution(int[] arr) {
        int res = 0 ;
        
        for(int i = 0 ; i < arr.length-1 ; i++)
        {   int min = arr[i] ;
            int max = arr[i] ;
            HashSet<Integer> set = new HashSet<>();
            set.add(arr[i]);
            for(int j = i+1 ;  j < arr.length ; j++)
            {
                if(set.contains(arr[j]))
                {
                    break ;
                }else{
                    set.add(arr[j]);
                    min = Math.min(min,arr[j]);
                    max = Math.max(max , arr[j]);
                    if(j - i == max - min)
                    {
                        if(j-i+1 > res)
                        {
                            res  = j - i + 1 ;
                        }
                    }
                }
            }
        }
        return res ;
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
