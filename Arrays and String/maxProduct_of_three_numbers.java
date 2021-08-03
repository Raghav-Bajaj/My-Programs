import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~
    public static int maximumProduct(int[] arr) {
       Arrays.sort(arr);
       int n = arr.length ;
       int one = arr[0]*arr[1]*arr[n-1];
       int two = arr[n-1]*arr[n-2]*arr[n-3];
       return one > two ? one : two ;
    }

    // ~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int prod = maximumProduct(arr);
        System.out.println(prod);
    }
}
