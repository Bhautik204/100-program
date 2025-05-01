//WAP to find whether string is palindrome or not.

import java.util.Scanner;

public class prog2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        if (ispalindrome(str) == true) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }

    }

    public static boolean ispalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
