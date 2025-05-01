// WAP to convert a Decimal number to BCD.
import java.util.Scanner;

public class prog15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String bcd = decimalToBCD(decimalNumber);
        System.out.println("BCD representation of " + decimalNumber + " is: " + bcd);
    }

    // Method to convert each digit to 4-bit binary
    public static String decimalToBCD(int number) {
        String numStr = Integer.toString(number);
        StringBuilder bcd = new StringBuilder();

        for (char digit : numStr.toCharArray()) {
            int d = Character.getNumericValue(digit);
            String binary = String.format("%4s", Integer.toBinaryString(d)).replace(' ', '0');
            bcd.append(binary).append(" ");
        }

        return bcd.toString().trim();
    }
}
