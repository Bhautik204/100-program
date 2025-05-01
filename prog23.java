// WAP to enter an element at specific position into array. (Do not take a new array)
import java.util.Scanner;

public class prog23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position (0 to " + n + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > n) {
            System.out.println("Invalid position!");
        } else {
          
            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = element; 

            n++; 

            System.out.println("Array after insertion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        
        sc.close();
    }
}
