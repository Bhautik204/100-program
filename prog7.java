// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)

import java.util.Scanner;

public class prog7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for fibonacci Series: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter positive number.");
        } else {
            fibonacciIterative(num);
            fibonacciRecursiveSeries(num);
        }
        sc.close();
    }

    public static void fibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (Iterative): ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void fibonacciRecursiveSeries(int n) {
        System.out.print("Fibonacci Series (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }
}
