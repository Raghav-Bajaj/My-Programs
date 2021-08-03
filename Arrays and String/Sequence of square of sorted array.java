import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static int[] sortedSquares(int[] nums) {
        // write your code here
        int i = 0 ;
        int j = nums.length -1 ;
        int[] ans = new int[nums.length];
        int p = nums.length -1 ;
        while(i <= j)
        {
            int a = nums[i]*nums[i] ;
            int b = nums[j]*nums[j] ;
            if(a > b)
            {
                ans[p] = a ;
                i++;
            }else{
                ans[p] = b ;
                j-- ;
            }
            p--;
        }
        return ans ;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++) 
            nums[i] = scn.nextInt();
        
        int[] res = sortedSquares(nums);

        for(int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
