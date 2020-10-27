import java.util.*;

import static java.lang.System.exit;

public class evenOdd {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number;
        for (; ; ) {
            System.out.println("Enter the number");
            number = scanner.nextInt();
            if (number == -1) exit(1);
            if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
            System.out.println("Enter -1 to quit");
        }
    }
}
