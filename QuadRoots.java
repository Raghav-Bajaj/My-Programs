import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.System.exit;

public class QuadRoots {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        for(;;){
            System.out.println("Enter a , b, c and '!' to exit");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if(a=='!'|| b=='!'||c=='!'){
                exit(1);
            }
            int D = b*b - 4*a*c ;
            if(D>0){
                System.out.println("Roots are real and different");
                float r1 = (float)(-b+sqrt(D))/(2*a);
                float r2 = (float)(-b-sqrt(D))/(2*a);
                System.out.println("Roots are : \n");
                System.out.println(r1);
                System.out.println(r2);
            }
            else if(D==0){
                System.out.println("Roots are real and same");
                float r3 = (float)(-b/(2*a));
                System.out.println("The root is");
                System.out.println(r3);
            }
           else  if(D<0){
                System.out.println("Roots are imaginary");
            }

        }
    }
}
