/* WAP to delete an element from array specified by user. if element is not found print a
message “Element is not found” (do not take a new array). */

import java.util.Scanner;

public class prog24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to delete: ");
        int element = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                found = true;
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--; 
                break; 
            }
        }

        if (found) {
            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Element is not found");
        }

        sc.close();
    }
}
