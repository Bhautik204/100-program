/* WAP to check weather number is present in array or not (using recursion only) and the
function’s syntax is given below
Int isInArray(int a[],int m);
Where int a[] is Array of integer and m is element to be searched. */

public class prog25 {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        int elementToSearch = 15;

        if (isInArray(array, elementToSearch) == 1) {
            System.out.println("Element is present in the array.");
        } else {
            System.out.println("Element is not present in the array.");
        }
    }

    static int isInArray(int a[], int m) {
        return isInArrayHelper(a, m, 0);
    }

    static int isInArrayHelper(int a[], int m, int index) {
        if (index >= a.length) {
            return 0;
        }
        if (a[index] == m) {
            return 1;
        }
        return isInArrayHelper(a, m, index + 1);
    }
}
