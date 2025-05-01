//WAP to find a factorial of a given integer (iterative and recursive)

import java.util.Scanner;

public class prog4 {

    public static long FactorialIntrative(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long FactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * FactorialRecursive(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Enter the non-negative number.");
        } else {
            System.out.println("Factorial (Iterative): " + FactorialIntrative(number));
            System.out.println("Factorial (Recursive): " + FactorialRecursive(number));
        }
        sc.close();
    }
}
