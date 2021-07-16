import java.util.*;

public class Main {
	
    public static void completeTask(int n, int m, int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i  < m ; i++)
		{
		    set.add(arr[i]);
		}
		
		boolean check = true ;
		ArrayList<Integer> v1 = new ArrayList<>();
			ArrayList<Integer> v2 = new ArrayList<>();
		for(int i = 1 ; i <= n ; i++)
		{
		    if(set.contains(i))
		    {
		        continue ;
		    }
		    if(check == true)
		    {
		        v1.add(i);
		        check = !check ;
		    }else{
		        v2.add(i);
		           check = !check ;
		    }
		    
		}
		for(int val : v1)
		{
		    System.out.print(val + " ");
		}
		System.out.println();
			for(int val : v2)
		{
		    System.out.print(val + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] num = new int[m];
		for (int i = 0; i < m; i++) {
			num[i] = scn.nextInt();
		}
		completeTask(n, m, num);
	}

}
