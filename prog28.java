// WAP to sort an Array using Tree sort.
import java.util.Scanner;

public class prog28 {
   
    static class Node {
        int data;
        Node left, right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    static void inOrderTraversal(Node root, int[] arr, int[] index) {
        if (root != null) {
            inOrderTraversal(root.left, arr, index);
            arr[index[0]++] = root.data;
            inOrderTraversal(root.right, arr, index);
        }
    }
    static void treeSort(int[] arr) {
        Node root = null;

        for (int value : arr) {
            root = insert(root, value);
        }

        int[] index = {0}; 
        inOrderTraversal(root, arr, index);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        treeSort(arr);

  
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
