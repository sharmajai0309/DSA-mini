package DSA;

import java.util.Arrays;

public class transpose {
    public static void rotatedMatrix(int[][] arr) {
        // Step 1: Transpose the 2D array
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int file = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = file;
            }

        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // function calling
        rotatedMatrix(arr);

        for (var mat : arr) {
            System.out.println(Arrays.toString(mat));
        }
    }
}
