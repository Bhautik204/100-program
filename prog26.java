// WAP to convert a Binary to Decimal.
import java.util.Scanner;

public class prog26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        // Convert binary to decimal
        int decimal = binaryToDecimal(binary);

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }

  
    static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            } else if (bit != '0') {
                System.out.println("Invalid binary number.");
                return -1;
            }
            power++;
        }

        return decimal;
    }
}
