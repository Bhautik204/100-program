// WAP to find a power a^b (without using power and multiplication operation).
import java.util.Scanner;

public class prog20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter exponent (b): ");
        int b = scanner.nextInt();
        scanner.close();

        int result = power(a, b);
        System.out.println(a + " raised to the power " + b + " is: " + result);
    }

    // Function to compute a^b
    public static int power(int a, int b) {
        if (b == 0) return 1;
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = multiply(result, a);
        }
        return result;
    }

    // Function to simulate multiplication using addition
    public static int multiply(int x, int y) {
        int result = 0;
        boolean negative = false;

        if (x < 0 && y < 0) {
            x = -x;
            y = -y;
        } else if (y < 0) {
            y = -y;
            negative = true;
        } else if (x < 0) {
            x = -x;
            negative = true;
        }

        for (int i = 0; i < y; i++) {
            result += x;
        }

        return negative ? -result : result;
    }
}
