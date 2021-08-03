import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~
    public static ArrayList<Integer> majorityElement2(int[] arr) {
        int val1 = 0 ;
        int count1 = 0 ;
        int val2 = 0 ;
        int count2 = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(val1 == arr[i])
            {
                count1++;
            }else if(val2 == arr[i])
            {
                count2++;
            }else{
                if(count1 == 0)
                {
                    val1 = arr[i] ;
                    count1++;
                }else if(count2 == 0)
                {
                    val2 = arr[i];
                    count2++ ;
                }else{
                    count1-- ;
                    count2-- ;
                }
            }
        }
        count1 = 0 ;
        count2 = 0 ;
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(val1 == arr[i])
                count1++ ;
            if(val2 == arr[i])
                count2++ ;
        }
        if(count1 > arr.length/3)
        {
            ar.add(val1);
        }
        if(count2 > arr.length/3)
        {
            ar.add(val2);
        }
        return ar ;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> res = majorityElement2(arr);
        System.out.println(res);
    }
}
