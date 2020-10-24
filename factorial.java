import java.util.Scanner;
import static java.lang.System.exit;


public class factorial {
    public  static void main(String args[]){
        System.out.println("Lets find factorial");
        int number;
        Scanner input = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter any number (-1 to quit)");
            number = input.nextInt();
            if(number == -1 ){
                exit(1);
            }else{
                int fact = 1 ;
                for (int i = 1; i <number ; i++) {
                    fact = fact*i;
                }
                System.out.println(fact);
            }
        }
    }
}
