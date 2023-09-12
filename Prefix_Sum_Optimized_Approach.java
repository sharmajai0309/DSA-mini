package DSA;

import java.util.Scanner;

public class Prefix_Sum_Optimized_Approach {
    public static void summatrix(int[][] ar) {
        int m = ar.length;
        int n = ar[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                ar[i][j] += ar[i][j - 1];
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                ar[i][j] += ar[i - 1][j];
            }
        }
    }

    public static int sumregion(int[][] ar, int r1, int r2, int c1, int c2) {
        int sum, up, left, sumregion, result = 0;

        sum = ar[r2][c2];
        up = ar[r1 - 1][c2];
        left = ar[r2][c2 - 1];
        sumregion = ar[r1 - 1][c2 - 1];
        result = sum - up - left - sumregion;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();

        System.out.println("Enter number of columns");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter the matrix elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Calculate prefix sums
        summatrix(arr);

        int r1, c1, r2, c2;

        System.out.print("Enter the value of r1 coordinate: ");
        r1 = sc.nextInt();

        System.out.print("Enter the value of c1 coordinate: ");
        c1 = sc.nextInt();

        System.out.print("Enter the value of r2 coordinate: ");
        r2 = sc.nextInt();

        System.out.print("Enter the value of c2 coordinate: ");
        c2 = sc.nextInt();

        // Calculate the sum of the submatrix
        int result = sumregion(arr, r1, r2, c1, c2);

        System.out.println("Sum of the submatrix: " + result);
    }

}
