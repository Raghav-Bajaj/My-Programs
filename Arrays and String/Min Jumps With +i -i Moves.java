import java.util.*;

public class Main {
    // ~~~~~~~~~~~~User Section~~~~~~~~~~~
    public static int minJumps(int x) {
        int sum = 0 ;
        int jump = 1 ;
        while(sum < x)
        {
            sum += jump ;
            jump++;
        }
        if((x-sum)%2 == 0)
            return jump - 1 ;
        else if((sum+jump-x)%2 == 0 )
            return jump ;
        else
            return jump+1;
    }

    //~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int jumps = minJumps(x);
        System.out.println(jumps);
    }
}
