import java.io.*;
import java.util.*;

public class Main {

    public static int solution(int[] arr){
      int ans = 0;
      for(int  i : arr)
            ans = ans ^ i ;
            
       
       return 2*ans;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }
    
    
}
