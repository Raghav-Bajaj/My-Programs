import java.util.*;

public class Main {
	
	public static ArrayList<Integer> powerfulIntegers(int x, int y, int bound) {
	HashSet<Integer> set = new HashSet<>();
	for(int i = 1 ; i < bound ; i*=x)
	{
	    for(int j = 1 ; i+j <= bound ; j *= y)
	    {
	        set.add(i+j);
	        if(y == 1)
	        {
	            break ;
	        }
	    }
	    if(x == 1)
	    {
	        break ;
	    }
	}

		return new ArrayList<>(set);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int bound = scn.nextInt();
		ArrayList<Integer> ret = new ArrayList<>();
		ret = powerfulIntegers(x, y, bound);
		Collections.sort(ret);
		for (int i = 0; i < ret.size(); i++) {
			System.out.print(ret.get(i) + " ");
		}
	}

}
