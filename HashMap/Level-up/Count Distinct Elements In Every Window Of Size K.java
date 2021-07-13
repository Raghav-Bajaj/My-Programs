import java.util.*;

public class Main {

	public static ArrayList<Integer> solution(int[] arr, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i = 0 ; i < k-1 ; i++)
		{
		    map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
		}
		
      for(int i = k-1 , j = 0 ; i < arr.length ; i++ , j++)
      {
           map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
           res.add(map.size());
           int freq  = map.get(arr[j]);
           if(freq == 1)
           {
               map.remove(arr[j]);
           }else{
               map.put(arr[j] , map.get(arr[j]) -1 ) ;
           }
      }
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		ArrayList<Integer> ans = solution(arr,k);
		for(int a : ans){
			System.out.print(a + " ");
		}
	}


}
