package DSA;

import java.util.Scanner;

public class matrix_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the values of m and n from the user
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize a 2D array to store the input integers
        int[][] matrix = new int[m][n];

        // Get m * n integers from the user
        System.out.println("Enter the integers:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter integer (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the input matrix in the specified format
        System.out.println("Input matrix:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Move to the next row
        }

        // Close the scanner
        scanner.close();
    }
}
