package DSA;

import java.util.Scanner;

class Binary_Search {
    public static int binarySearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
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
        return -1; // Return -1 to indicate that the element was not found.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int ar[] = new int[n];

        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("Enter the target value to search for:");
        int x = sc.nextInt();

        // Perform binary search
        int result = binarySearch(ar, x);

        if (result == -1) {
            System.out.println("Searched element is not found in the array");
        } else {
            System.out.println("Searched element is found in the array at index: " + result);
        }
    }
}
