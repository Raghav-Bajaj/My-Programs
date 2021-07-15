import java.util.*;

public class Main {

	public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
		HashMap<HashMap<Character,Integer> , ArrayList<String>> map = new HashMap<>();
		for(int i = 0 ; i  < strs.length ; i++)
		{
		    String s = strs[i];
		    HashMap<Character,Integer> mp = new HashMap<>();
		    for(int j = 0 ; j < s.length() ; j++ )
		    {
		        char ch = s.charAt(j);
		        mp.put(ch , mp.getOrDefault(ch,0)+1);
		    }
		    if(map.containsKey(mp))
		    {
		        map.get(mp).add(s);
		    }else{
		        ArrayList<String> aa = new ArrayList<>();
		        aa.add(s);
		        map.put(mp,aa);
		    }
		}
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        for(HashMap<Character,Integer> a : map.keySet())
        {
            res.add(map.get(a));
        }
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		ArrayList<ArrayList<String>> anagramsGrouped = groupAnagrams(arr);
		for (ArrayList<String> lst : anagramsGrouped) {
			Collections.sort(lst);
		}
		anagramsGrouped.sort(new ListComparator());
		display(anagramsGrouped);
	}

	// it is used to make the result unique
	static class ListComparator implements Comparator<List<String>> {
		@Override
		public int compare(List<String> l1, List<String> l2) {
			if (l1.size() != l2.size()) {
				return l2.size() - l1.size();
			}

			String l1str = l1.get(0);
			String l2str = l2.get(0);
			return l1str.compareTo(l2str);

		}
	}

	public static void display(ArrayList<ArrayList<String>> list) {
		for (int i = 0; i < list.size(); i++) {
			ArrayList<String> currList = list.get(i);
			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}
			System.out.println();
		}
	}

}
