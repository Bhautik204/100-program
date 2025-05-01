/* WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
should be taken from user (Note that you are not allowed to use an array for this) */
import java.util.Scanner;

public class prog12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int count = 0;
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        // using while loop
        while (count < n) {
            System.out.print("Enter number " + (count + 1) + ": ");
            number = sc.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            sum += number;
            count++;
        }

        // using for loop
        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        double average = sum / n;

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);

        sc.close();
    }
}
