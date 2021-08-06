import java.util.Scanner;

public class Main {
  public static double solution(int nums[], int k) {
    int i = 0 ;
    int n = nums.length ;
    int max = 0 ;
   while(i < k && i < n)
   {
       max  += nums[i] ;
       i++;
   }
   int temp = max ;
   for(int j = i ; j < n ; j++)
   {
      temp +=  nums[j] - nums[j-k] ;
       max = Math.max(temp,max);
   }
   double m = max / (k*1.0) ;
   return m ;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nums[] = new int[n];
    for (int i = 0 ; i < n ; i++) {
      nums[i] = scn.nextInt();
    }
    int k = scn.nextInt();

    System.out.println(solution(nums, k));
  }
}
