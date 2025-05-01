// WAP to find a summation of a digit of a given number. (Iterative and recursive)

import java.util.Scanner;

public class prog5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Sum of digits (iterative): " + sumOfDigitsIterative(number));
        System.out.println("Sum of digits (recursive): " + sumOfDigitsRecursive(number));

        scanner.close();
    }

    public static int sumOfDigitsIterative(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int sumOfDigitsRecursive(int num) {
        num = Math.abs(num);
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumOfDigitsRecursive(num / 10);
    }
}
