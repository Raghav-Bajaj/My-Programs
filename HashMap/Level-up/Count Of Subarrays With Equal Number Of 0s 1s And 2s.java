import java.util.*;

public class Main {

    public static int solution(int[] arr) {
       HashMap<String,Integer> map = new HashMap<>();
       map.put("0@0",1);
       int one = 0 ;
       int two = 0 ;
       int zero = 0 ;
       int count = 0 ;
        for(int  i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 1)
            {
                one++ ;
            }else if(arr[i] == 2)
            {
                two++;
            }else {
              zero++;  
            }
            String s = (one-zero)+"@"+(two-one);
            // System.out.println(s);
            if(map.containsKey(s))
            {
                count+= map.get(s);
            }
               map.put(s , map.getOrDefault(s,0)+1);
            
            
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
