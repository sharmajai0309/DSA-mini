package DSA;

import java.util.Arrays;

public class bubble_sort {

    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int data = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = data;
                    swap = true;
                }

            }
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 23, 141, 14, 21, 131, 42, 53, 46, 4, 5, 6, 23, 4, 19, 12, 6, 1, 3, 1, 24 };
        bubblesort(arr);

        System.out.println("Shorted array is " + Arrays.toString(arr));

    }

}
