/**
 *
 * @author Trevor Hartman
 * @author Brandin Crockett
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class MyMath {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        int result = gcf(a, b);
        System.out.println("The greatest common factor of " + a + " and " + b + " is " + result);
    }

    public static int gcf(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcf(b, a % b);
        }
    }
}
