// WAP to find weather given number is Armstrong number is not.

import java.util.Scanner;

public class prog11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is Armstrong Number.");
        } else {
            System.out.println(num + " is not Armstrong Number.");
        }
    }

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static int digitsCount(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = digitsCount(num);
        while (num > 0) {
            int digit = num % 10;
            sum += power(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
}
