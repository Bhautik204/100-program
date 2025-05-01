
import java.util.Scanner;

public class prog22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Choose a pattern to print:");
        System.out.println("1. Number and Alphabet Centered Triangle");
        System.out.println("2. Reverse Centered Star Triangle");
        System.out.println("3. Curtain Pattern");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                pattern1(rows);
                break;
            case 2:
                pattern2(rows);
                break;
            case 3:
                pattern3(rows);
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }
        sc.close();
    }

    public static void pattern1(int rows) {
        int num = 1;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
        return;
    }

    public static void pattern2(int rows) {

        for (int i = rows; i >= 1; i--) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(); 
        }
    }

    public static void pattern3(int rows) {
        for (int i = rows; i >= 1; i--) {
            // Print left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces in middle
            int spaces = (rows - i) * 2;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // Print right side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line
        }
    }
}
