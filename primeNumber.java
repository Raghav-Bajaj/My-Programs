import java.util.*;

import static java.lang.System.exit;

public class primeNumber {
public static void main(String args[]){
    Scanner src  = new Scanner(System.in);
    System.out.println("Program to check if number is prime or not");
    System.out.println("Enter the number");
    int number = src.nextInt();
    int i = 0 ;
    for( i = 2 ; i < number ; i++){
                if(number%i == 0){
                    System.out.println("the number is not prime");
                    return;
                }
    }
    System.out.println("The number is prime");
}

}


