package DSA;

import java.util.Scanner;

public class lower_bound {
    public static int lowerbound(int[] ar, int target) {
        int low = 0;
        int high = ar.length - 1; // Adjusted high to the correct index
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (ar[mid] == target) {
                result = mid;
                high = mid - 1; // Updated high to search for lower bound
            } else if (ar[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result; // Moved return statement outside the loop
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements you want to enter in the array (sorted)");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find the lower bound for");
        int x = sc.nextInt();

        int result = lowerbound(arr, x);

        if (result != -1) {
            System.out.println("Lower bound of " + x + " is at index " + result);
        } else {
            System.out.println(x + " is not found in the array.");
        }
    }
}
