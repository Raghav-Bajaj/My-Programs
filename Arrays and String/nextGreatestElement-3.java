import java.util.*;

public class Main {
    
    //~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~
    public static String nextGreaterElement(String str) {
    
    char[] arr = str.toCharArray();
    int i = arr.length - 2 ; 
    while(i >=0 && arr[i] > arr[i+1])
    {
        i-- ;
    }
    if(i < 0)
    {
        return "-1" ;
    }
    int k =  arr.length - 1 ;
    while(arr[i] >= arr[k])
    {
        k-- ;
    }
    char temp = arr[i] ;
    arr[i] = arr[k] ;
    arr[k] = temp ;
    String ans = "";
    int j =0 ;
    while( j <= i)
    {
        ans += arr[j];
        j++;
    }
    k = str.length()-1 ;
    while(k >i)
    {
        ans += arr[k] ;
        k-- ;
    }
    return ans ;
    }

    //~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num = scn.next();
        String res = nextGreaterElement(num);

        System.out.println(res);
    }
}
