package DSA;

import java.util.Scanner;

public class total_number_of_1s {
    public static int totalnumber(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int count = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 7, 3, 3, 3, 3, 3, 3, 4, 3, 35, 4, 5, 5, 5,
                5, 5, 1, 1, 1, 1 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1 or 0 : ");
        int target = sc.nextInt();

        int result = totalnumber(arr, target);
        // if (target == 0) {
        // System.out.println("Total number of 0s in this Array : " + result);

        // } else if (target == 1) {
        // System.out.println("Total number of 1s in this Array : " + result);

        // }
        System.out.println("Total number of in this Array : " + result);

    }

}
