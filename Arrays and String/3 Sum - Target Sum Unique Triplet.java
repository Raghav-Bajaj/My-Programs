import java.util.*;

public class Main {

  // ~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static List<List<Integer>> threeSum(int[] arr, int target) {
    List<List<Integer>> sol = new ArrayList<>();

    Arrays.sort(arr);
    int k = 0 ;
    while(k < arr.length)
    {
        if(arr[k] < target)
        {
            int t = target- arr[k] ;
               int i = k+1 ;
               int j = arr.length-1 ;
         while(i < j )
    {
        int num = arr[i] + arr[j] ;
        if(num >t)
        {
            j--;
        }else if(num < t)
        {
            i++;
        }else{
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(arr[k]);
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
        }
        
        k++ ;
        while(k < arr.length && arr[k] == arr[k-1])
        {
            k++;
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
    List<List<Integer>> res = threeSum(arr, target);
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
