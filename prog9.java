// WAP to find whether a number is Odd or Even without using a % operator.

import java.util.Scanner;

public class prog9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // using simply mathamatic 
        if ((num / 2) * 2 == num) {
            System.out.println("Number is even");
        } else {
            System.err.println("number is not even");
        }
// usind Bitwise AND
        /*  if (num & 1) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }
         */
    }
}
