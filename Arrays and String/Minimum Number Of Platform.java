import java.util.*;

public class Main {

  public static int findPlatform(int[] arr, int[] dep) {
Arrays.sort(arr);
Arrays.sort(dep);
int i = 0 , j = 0 ;
int n = arr.length ;
int count = 0 ;
int plat = 0 ;
while(i < n && j < n)
{
    if(arr[i] < dep[j])
    {
        count++;
        i++;
    }else{
        count-- ;
        j++;
    }
    plat = Math.max(plat,count);
}
return plat ; 
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int[] dep = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    for (int i = 0; i < n; i++) {
      dep[i] = scn.nextInt();
    }

    int plateforms = findPlatform(arr, dep);
    System.out.println(plateforms);
  }
}
