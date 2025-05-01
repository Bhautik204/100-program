// WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user)

import java.util.Scanner;

public class prog13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for 1st matrix : ");
        int row1 = sc.nextInt();
        System.out.print("Enter number of colums for 1st matrix : ");
        int colum1 = sc.nextInt();

        System.out.print("Enter number of rows for 2nd matrix : ");
        int row2 = sc.nextInt();
        System.out.print("Enter number of colums for 2nd matrix : ");
        int colum2 = sc.nextInt();

        if (colum1 != row2) {
            System.out.println("Matrix multiplication not possible. Columns of first matrix must equal rows of second.");
            return;
        }
        
        int[][] m1 = new int[row1][colum1];
        System.out.println("Enter the Element of 1st matrix : ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < colum1; j++) {
                System.out.print("m1[" + i + "][" + j + "] : ");
                m1[i][j] = sc.nextInt();
            }
        }

        
        int[][] m2 = new int[row2][colum2];
        System.out.println("Enter the Element of 2nd matrix : ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < colum2; j++) {
                System.out.print("2 [" + i + "][" + j + "] : ");
                m2[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[row1][colum2];

        // matrix multiplication
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < colum2; j++) {

                for (int k = 0; k < colum1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        // for result print
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < colum2; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
