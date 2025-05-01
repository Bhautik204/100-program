// WAP to find a quotient and reminder of 2 number (bigger number should be divided by lower number) and you are not allowed to use a division and quotient operator.
import java.util.Scanner;

public class prog29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int dividend = Math.max(a, b);
        int divisor = Math.min(a, b);

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }

        int quotient = 0;
        int remainder = dividend;

        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        sc.close();
    }
}
