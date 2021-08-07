import java.util.*;
import java.io.*;

public class Main {
    public static class Marks implements Comparable<Marks>{
        int phy ;
        int chem ;
        int math ;
        Marks()
        {
            
        }
        Marks(int phy , int chem , int math)
        {
            this.phy = phy ;
            this.chem = chem ;
            this.math = math ;
        }
        public int compareTo(Marks o)
        {
            if(this.phy != o.phy)
            {
                return this.phy - o.phy ;
            }else if(this.chem != o.chem)
            {
                return o.chem - this.chem ;
            }else{
                return this.math - o.math ;
            }
        }
    }
    /*You have to complete the body of customSort function, 
    after sorting final changes should be made in given arrays only. */
    public static void customSort(int[]phy,int[]chem,int[]math) {
        int n = phy.length ;
        Marks[] studs = new Marks[n] ;
        for(int i = 0 ; i < n ; i++)
        {
                studs[i]  = new Marks(phy[i] , chem[i] , math[i]);
        
        }
        Arrays.sort(studs);
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(studs[i].phy + " " + studs[i].chem + " " + studs[i].math);
        }
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        //input work
        int N = scn.nextInt();

        int[]phy = new int[N];
        int[]chem = new int[N];
        int[]math = new int[N];

        for(int i=0; i < N;i++) {
            phy[i] = scn.nextInt();
        }

        for(int i=0; i < N;i++) {
            chem[i] = scn.nextInt();
        }

        for(int i=0; i < N;i++) {
            math[i] = scn.nextInt();
        }

        customSort(phy,chem,math);

        // //output
        // for(int i=0; i < N;i++) {
        //     System.out.println(phy[i] + " " + chem[i] + " " + math[i]);
        // }
    }
}
