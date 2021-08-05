import java.util.*;

public class Main {

  // ~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static List<List<Integer>> twoSum(int[] arr, int target) {
     List<List<Integer>> sol = new ArrayList<>();
    int i = 0 ;
    int j = arr.length-1 ;
    Arrays.sort(arr);
    while(i < j )
    {
        int num = arr[i] + arr[j] ;
        if(num >target)
        {
            j--;
        }else if(num < target)
        {
            i++;
        }else{
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(arr[i]);
            ans.add(arr[j]);
            sol.add(ans) ;
        
            i++;
            j-- ;
            while(i < j && arr[i] == arr[i-1])
            {
               i++; 
            }
            while(j > i && arr[j] == arr[j+1])
            {
                j-- ;
            }
        }
    }
    return sol;
  }

  // ~~~~~~~~~~Input Management~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    List<List<Integer>> res = twoSum(arr, target);
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
