import java.util.*;

public class Main {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target, int n) {
	        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        Arrays.sort(arr);
        for(int  i = 0 ; i  < arr.length-3 ; i++)
        {
            if(i != 0 && arr[i] == arr[i-1])
            {
                continue ;
            }
            for(int j = i+1 ; j < arr.length - 2 ; j++)
            {
                if(j != i+1 && arr[j] == arr[j-1])
                {
                    continue ;
                }
                int l = j+1 ;
                int r = arr.length -1 ;
                
                
                while(l < r)
                {
                    if(arr[i] + arr[j] + arr[l] + arr[r] == target)
                    {ArrayList<Integer> ans = new ArrayList<>();
                         ans.add(arr[i]);
                         ans.add(arr[j]);
                         ans.add(arr[l]);
                         ans.add(arr[r]);
                        ls.add(ans);
                     l++;
                     r-- ;
                     while(l < r && arr[l] == arr[l-1])
                     {
                         l++;
                     }
                      while(l < r && arr[r] == arr[r+1])
                     {
                         r-- ;
                     }
                    }else if(arr[i] + arr[j] + arr[l] + arr[r] < target)
                    {
                        l++ ;
                    }else{
                        r-- ;
                    }
                    
                }
            }
        }
        return ls ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		ArrayList<ArrayList<Integer>> ans = fourSum(arr, target, n);
		Collections.sort(ans,(a,b)->{
            int i = 0;
            int j = 0;
            
            while(i < a.size()){
                if(a.get(i) == b.get(j)){
                    i++;
                    j++;
                }else{
                    return a.get(i) - b.get(j);
                }
            }
            
            return 0;
        }); 
		for (ArrayList<Integer> a : ans) {
			for (int element : a) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}
