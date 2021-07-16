import java.util.*;

public class Main {

    public static String solution(int num, int den) {
      StringBuilder ss = new StringBuilder();
      int q = num/den;
      int r = num%den;
      ss.append(q);
      if(r == 0)
      {
          return ss.toString();
      }else{
          HashMap<Integer,Integer> map = new HashMap<>();
          ss.append(".");
          while(r != 0)
          {
              if(map.containsKey(r))
              {
                  ss.insert(map.get(r) , "(");
                  ss.append(")");
                  break ;
              }else{
                  map.put(r , ss.length());
                  r *= 10 ;
                  q = r/den ;
                  r = r%den ;
                  ss.append(q);
              }
          }
      }
        
        return ss.toString();
    }
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int den = scn.nextInt();
		System.out.println(solution(num , den));
	}

}
