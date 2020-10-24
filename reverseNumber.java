import java.util.Scanner;

import static java.lang.System.exit;

public class reverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for (;;){
            System.out.println("Enter a number to Check if it is Palindrome or not (-1 to quit)");
            int number = sc.nextInt();
            int original = number ;
            if(number == -1){
                exit(0);
            }
            int rev = 0;
            while(number > 0){
                int rem = number%10 ;
                number = number/10;
                rev = rev *10+rem;
            }
            if(original == rev)
            {
                System.out.println(original+" is a Palindrome");
            }
            else
            {
                System.out.println(original+" is not a Palindrome");
            }
        }

    }
}
