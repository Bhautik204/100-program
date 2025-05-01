// WAP to convert a Decimal to Binary.
import java.util.Scanner;

public class prog30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        if (decimal < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        String binary = decimalToBinary(decimal);
        System.out.println("Binary equivalent: " + binary);

        sc.close();
    }
    static String decimalToBinary(int n) {
        if (n == 0) return "0";

        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            binary.insert(0, n % 2); 
            n = n / 2;
        }

        return binary.toString();
    }
}
