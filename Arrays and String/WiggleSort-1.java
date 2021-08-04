import java.util.*;

public class Main {

  // ~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~
  public static void wiggleSort(int[] arr) {
      int n = arr.length ;
    for(int i = 0 ; i < n-1 ; i++ )
    {
        if(i%2 == 0)
        {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i] ;
                arr[i] = arr[i+1];
                arr[i+1] = temp ;
             }
        }else{
            if(arr[i] < arr[i+1])
            {
                   int temp = arr[i] ;
                arr[i] = arr[i+1];
                arr[i+1] = temp ;
            }
        }
        
    }
  }

  // ~~~~~~~~~~~~Input Management~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    wiggleSort(arr);

    for (int val : arr) {
      System.out.print(val + " ");
    }
    System.out.println();
  }

}
