import java.util.*;

public class Main {

    public static void solution(int[] arr) {
       HashMap<Integer,Integer> freq = new HashMap<>();
          HashMap<Integer,Integer> start = new HashMap<>();
          int hfreq = 0 ;
          int st = -1 ;
          int e = -1 ;
          int l = 0 ;
         for(int i = 0 ; i  < arr.length ; i++) 
         {
             if(freq.containsKey(arr[i]))
             {
                 freq.put(arr[i] , freq.get(arr[i]) + 1 );
             }else{
                 freq.put(arr[i] , 1);
                 start.put(arr[i] , i);
             }
             
             if(freq.get(arr[i]) > hfreq )
             {
                 hfreq = freq.get(arr[i]) ;
                 st = start.get(arr[i]);
                 e = i ;
                 l = e - st + 1 ;
             }else if(freq.get(arr[i]) == hfreq ){
                 int clen = i - start.get(arr[i]) + 1 ;
                 if(clen < l)
                 {
                      hfreq = freq.get(arr[i]) ;
                 st = start.get(arr[i]);
                 e = i ;
                 l = e - st + 1 ; 
                 }
             }
         }
            System.out.println(arr[st]);
       System.out.println(st);
        System.out.println(e);
       
    }
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
                solution(arr);
	}

}
