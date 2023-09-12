package DSA;

import java.util.Arrays;

public class Insertion_sort {
    public static void insertion_sort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int j = i;
            while (j > 0 && ar[j] < ar[j - 1]) {
                int temp = ar[j];
                ar[j] = ar[j - 1];
                ar[j - 1] = temp;
                j--;

            }

        }
    }

    public static void main(String[] args) {
        int[] ar = { 9, 23, 141, 14, 21, 131, 42, 53, 46, 4, 5, 6, 23, 4, 19, 12, 6, 1, 3, 1, 24 };
        insertion_sort(ar);

        System.out.println("the sorted array is" + Arrays.toString(ar));

    }

}
