import java.util.*;

import static java.lang.System.exit;

public class hcf
{
    public  static  void  main(String args[]){
        Scanner scan = new Scanner(System.in);
        for(;;){
            int divident = scan.nextInt();

            if(divident == -1){
                exit(0);
            }
            int divisor = scan.nextInt();
            while(divident%divisor != 0){
                int rem = divident %  divisor ; ;
                divident = divisor;
                divisor = rem ;
            }
            System.out.println(divisor);
        }

    }
}
