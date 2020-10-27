import java.util.Scanner;

public class Fibonacci {
    public static  void main(String args[]){
        Scanner src = new Scanner(System.in);
        int number = src.nextInt();
        int a = 0 ;
        int b = 1 ;
        int sum = 0;
        System.out.println(a);
        System.out.println(b);
        int counter = 2 ;
        int newDigit = a + b;
      while(counter < number){
          System.out.println(newDigit);
          a = b ;
          b = newDigit;
          newDigit = a + b;
          counter++;
      }
    }
}
