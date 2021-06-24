import java.io.*;
import java.util.*;

public class Main {

    public static void queensCombinations(int qpsf, int tq, int row, int col, String asf){
        if(tq == row)
        {
           if(qpsf == tq)
           {
               System.out.println(asf);
           }
            return;
        }
        String yes = asf ;
        String no = asf ;
        int nr = row ;
        int nc = col ;
        if(col < tq-1 )
        {
            nc++ ;
            yes +="q";
            no+="-";
        }else{
            nc = 0 ;
            nr++ ;
             yes +="q\n";
            no+="-\n";
        }
         queensCombinations(qpsf+1 , tq , nr,nc,yes);
         queensCombinations(qpsf , tq ,nr,nc,no);
       
       
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        queensCombinations(0, n, 0, 0, "");
    }
}
