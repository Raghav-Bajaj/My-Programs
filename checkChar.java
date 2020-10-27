package practice;

import java.util.Scanner;

import static java.lang.System.exit;

public class checkChar {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

       for (;;){
           System.out.println("input character '!' for exit");
           char character = input.nextLine().charAt(0);
           if(character == '!'){
            exit(1);
           }
           else{
               if(character >='A' && character <= 'Z'){
                   System.out.println("Upper case char");
               }
               else  if(character >='a' && character <= 'z'){
                   System.out.println("Lower case char");
               }
               else {
                   System.out.println("Special char");
               }
           }
       }
    }
}
