// WAP to find a total odd and total even digit of a given number.

import java.util.Scanner;

public class prog8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        OddEvenCount(num);
        sc.close();

    }

    public static void OddEvenCount(int num) {
        int odd = 0, even = 0;
        num = Math.abs(num);
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num / 10;
        }
        System.out.println("Total Odd digit are : "+odd);
        System.out.println("Total even digit are : "+even);
    }
}