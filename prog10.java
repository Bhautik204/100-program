// WAP to find a prime number between range (range should be entered by user).

import java.util.Scanner;

public class prog10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = sc.nextInt();

        System.out.println("Enter end: ");
        int end = sc.nextInt();

        boolean flag = true;

        for (int i = start; i <= end; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + ", ");
            }
        }
    }
}
