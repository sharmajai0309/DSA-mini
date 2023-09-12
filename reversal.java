package DSA;

import java.util.Arrays;

public class reversal {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = ar.length;

        for (int i = 0; i < n / 2; i++) {
            int file = ar[i];
            ar[i] = ar[n - i - 1];
            ar[n - i - 1] = file;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
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
