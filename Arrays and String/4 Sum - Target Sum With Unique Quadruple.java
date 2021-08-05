import java.util.*;

public class Main {

  public static List<List<Integer>> fourSum(int[] nums, int target) {
  List<List<Integer>> sol = new ArrayList<>();

    Arrays.sort(nums);
    int s = 0;
    while(s <  nums.length -3)
    {
        if(nums[s] < target)
        {
            int k = s+1 ;
              while(k < nums.length - 2)
    {
        if(nums[k] < target - nums[s])
        {
            int t = target- nums[s]- nums[k] ;
               int i = k+1 ;
               int j = nums.length-1 ;
         while(i < j )
    {
        int num = nums[i] + nums[j] ;
        if(num >t)
        {
            j--;
        }else if(num < t)
        {
            i++;
        }else{
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(nums[s]);
            ans.add(nums[k]);
            ans.add(nums[i]);
            ans.add(nums[j]);
            sol.add(ans) ;
        
            i++;
            j-- ;
            while(i < j && nums[i] == nums[i-1])
            {
               i++; 
            }
            while(j > i && nums[j] == nums[j+1])
            {
                j-- ;
            }
        }
    }
        }
        
        k++ ;
        while(k < nums.length -2 && nums[k] == nums[k-1])
        {
            k++;
        }
    }
            
        }
        s++;
        while(s < nums.length -3 && nums[s] == nums[s-1])
        {
            s++;
        }
    }
    
  

    return sol;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    List<List<Integer>> res = fourSum(arr, target);
    ArrayList<String> finalResult = new ArrayList<>();
    for (List<Integer> list : res) {
      Collections.sort(list);
      String ans = "";
      for (int val : list) {
        ans += val + " ";
      }
      finalResult.add(ans);
    }
    Collections.sort(finalResult);
    for (String str : finalResult) {
      System.out.println(str);
    }
  }
}
