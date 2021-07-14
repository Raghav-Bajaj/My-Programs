import java.util.*;

public class Main {

    public static int solution(int[] arr){
        int n = arr.length ;
       int i = -1 ;
       int j = -1 ;
       int count = 0 ;
       int ans = 0 ;
       while(true)
       {
           boolean f1 = false ;
           boolean f2 = false ;
           while(i < n-1)
           {
               f1 = true ;
               i++;
               if(arr[i] == 0)
               {
                   count++;
               }
               if(count > 1)
               {
                   break ;
               }
               if(i-j > ans)
               {
                   ans = i - j ;
               }
           }
           if(ans == n)
           {
               return ans ;
           }
           while(j < i)
           {
               f2 = true ;
               j++;
               if(arr[j] == 0)
               {
                  count-- ;
               }
               if(count == 1)
               {
                   break ;
               }
           }
           if(f1==false && f2 == false)
           {
               break ;
           }
       }
       

        return ans;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
	}

}
