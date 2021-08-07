import java.util.*;
import java.io.*;

public class Main {

    /*You have to complete union function and return an Arraylist which contains union elements of the two arrays*/
    public static ArrayList<Integer> union(int[] a,int[] b) {
        ArrayList<Integer> sol = new ArrayList<>();
        int i = 0 , j = 0 ;
        int n1 = a.length , n2 = b.length ;
        int temp = Integer.MIN_VALUE ;
        while(i < n1 && j < n2)
        {
            if(sol.size() != 0)
            {
                temp = sol.get(sol.size()-1);
            }
            if(a[i] < b[j])
            {
                if(temp != a[i] )
                {
                    sol.add(a[i]);
                    
                }
                i++;
            }else{
                if(temp != b[j])
                {
                    sol.add(b[j]);
                }
                j++ ;
            }
        }
        while(i < n1)
        {
            if(sol.get(sol.size()-1 ) != a[i])      
                sol.add(a[i]);
            i++ ;
        }
        while(j < n2)
        {
         if(sol.get(sol.size()-1 ) != b[j])  
            sol.add(b[j]);
            j++;
        }
        
        
        return sol;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        //input work
        int n = scn.nextInt();
        int[]a = new int[n];
        for(int i=0; i < n;i++) {
            a[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[]b = new int[m];
        for(int i=0;i < m;i++) {
            b[i] = scn.nextInt();
        }

        ArrayList<Integer>ans = union(a,b);

        //print answer list
        for(int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
