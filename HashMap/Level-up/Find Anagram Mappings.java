import java.util.*;

public class Main {
	public static int[] anagramMappings(int[] arr1, int[] arr2) {
	HashMap<Integer , ArrayDeque<Integer>> map = new HashMap<>();
	for(int i = 0 ; i < arr2.length ; i++)
	{
	    int a = arr2[i] ;
	    if(map.containsKey(a))
	    {
	         map.get(a).add(i);
	        
	    }else{
	        ArrayDeque<Integer> st = new ArrayDeque<>();
	        st.add(i);
	        map.put(a , st);
	    }
	}
	int[] res = new int[arr1.length];
	for(int  i = 0 ; i < arr1.length ; i++)
	{
	    int a = map.get(arr1[i]).remove();
	    res[i] = a ;
	}

		return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int j = 0; j < b.length; j++) {
			b[j] = s.nextInt();
		}
		int[] res = anagramMappings(a, b);
		for (int j = 0; j < res.length; j++) {
			System.out.print(res[j] + " ");
		}
	}

}
