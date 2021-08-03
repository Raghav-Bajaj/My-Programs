import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static boolean isPossible(String name, String typed) {
        // Write your code here
        int i = 0 ;
        int n = name.length();
        int l = typed.length();
        int k = 0 ;
        if(l < n)
            return false ;
        while(i < n && k < l)
        {
            char a = name.charAt(i);
            char b = typed.charAt(k);
            if(a == b)
            {
                i++;
                k++;
            }else if(i>0 && b == name.charAt(i-1))
            {
                k++;
            }else{
                return false ;
            }
            
            
        }
        if(i != n)
            return false ;
        while(k<l)
        {
               char a = name.charAt(n-1);
            char b = typed.charAt(k);
            if(b != a)
                return false;
            k++;
        }
        return true ;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String name = scn.next();
        String typed = scn.next();

        boolean res = isPossible(name, typed);

        System.out.println(res);
    }
}
