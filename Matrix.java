import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int n, m, i = 0, j = 0, min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row");
        m = sc.nextInt();
        System.out.println("Enter no of column:");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter all the elements:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int b[][] = new int[m + 1][n + 1];
        // Copy original matrix to b and find row minimums
        for (i = 0; i < m; i++) {
            min = a[i][0];
            for (j = 0; j < n; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
                b[i][j] = a[i][j];
            }
            b[i][n] = min; // Store row minimum at the end of each row
        }
        // Find column minimums
        for (j = 0; j < n; j++) {
            min = a[0][j];
            for (i = 0; i < m; i++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
            b[m][j] = min; // Store column minimum at the end of each column
        }
        // Find minimum of the last row and column
        min = a[0][0];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        b[m][n] = min;
        System.out.println("Array is:");
        for (int x[] : b) {
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }
}
