package DSA;

import java.util.Scanner;

public class brute_force_PrefixSumApproch {
    public static int findsumMatrix(int[][] arr, int r1, int r2, int c1, int c2) {
        int Sum = 0;
        for (int i = r1; i < r2; i++) {
            for (int j = c1; j < c2; j++) {
                Sum += arr[i][j];
            }
        }
        return Sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of columns");
        int m = sc.nextInt();
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int arr[][] = new int[n][m];

        System.out.println("Enter the matrix of elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int r1, r2, c1, c2;
        System.out.println("Enter the value of r1");
        r1 = sc.nextInt();

        System.out.println("Enter the value of c1");
        c1 = sc.nextInt();

        System.out.println("Enter the value of r2");
        r2 = sc.nextInt();

        System.out.println("Enter the value of c2");
        c2 = sc.nextInt();

        int result = findsumMatrix(arr, r1, r2, c1, c2);
        System.out.println("Sum of elements of the given rectangle is: " + result);

        sc.close();
    }
}
