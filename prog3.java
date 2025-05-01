//WAP to find a Factor of a given number (iterative and recursive)

import java.util.Scanner;

public class prog3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        findFactorsIterative(num);

        System.out.println("Factors (Recursive):");
        findFactorsRecursive(num, 1);

        sc.close();
    }

    public static void findFactorsIterative(int number) {
        System.out.println("Factors (Iterative):");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void findFactorsRecursive(int number, int i) {
        if (i > number) {
            return;
        }

        if (number % i == 0) {
            System.out.print(i + " ");
        }

        findFactorsRecursive(number, i + 1);
    }
}
